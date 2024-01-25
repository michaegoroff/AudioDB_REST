package updater;

import client.AudioClient;
import dtos.AlbumDto;
import dtos.ArtistDto;
import dtos.ClipDto;
import dtos.TrackDto;
import mappers.MapperCatalog;
import model.Album;
import model.Artist;
import model.Clip;
import model.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import repositories.DataCatalog;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Component
public class AudioUpdater implements IAudioUpdater {
    private DataCatalog dataCatalog;
    @Autowired
    private AudioClient client;
    @Autowired
    private MapperCatalog mapper;

    public AudioUpdater(DataCatalog dataCatalog, AudioClient client,MapperCatalog mapper){
        this.dataCatalog = dataCatalog;
        this.client = client;
        this.mapper = mapper;
    }

    @Override
    public void updateAllAlbumsByArtistName(String name) {


        //saving all albums of an artist
        List<AlbumDto> albums = this.client.getAllAlbumsByArtistName(name);

        //saving the artist
        ArtistDto artist = this.client.getArtistById(albums.get(0).getArtistId());
        Optional<Artist> sourceArtist = this.dataCatalog.getArtists().findById(artist.getId());
        //if not present then save
        if(!sourceArtist.isPresent()){
            this.dataCatalog.getArtists().save(mapper.getArtistMapper().map(artist));
        }

        List<Album> entities = albums.stream().map(album -> mapper.getAlbumMapper().map(album)).toList();
        List<Long> sourceAlbumIds = dataCatalog.getAlbums().findAll().stream().map(entity -> entity.getId()).toList();
        List<Album> entitiesToSave = entities.stream().filter(Predicate.not(entity->sourceAlbumIds.contains(entity.getId()))).toList();

        entitiesToSave.forEach(entity->{
            dataCatalog.getAlbums().save(entity);
        });
    }

    @Override
    public void updateAllInfoByArtistId(Long id) {
        //getting dtos from remote db
        List<ClipDto> clips = this.client.getAllClipsByArtistId(id);
        List<AlbumDto> albums = this.client.getAllAlbumsByArtistId(id);
        List<TrackDto> tracks = new ArrayList<>();
        for(AlbumDto album : albums){
            List<TrackDto> albumTracks = this.client.getAllTracksByAlbumId(album.getId());
            tracks.addAll(albumTracks);
        }
        ArtistDto artist = this.client.getArtistById(id);

        //saving entities

        //saving artist
        Optional<Artist> sourceArtist = this.dataCatalog.getArtists().findById(artist.getId());
        if(!sourceArtist.isPresent()){
            this.dataCatalog.getArtists().save(mapper.getArtistMapper().map(artist));
        }

        //saving albums
        List<Album> albumEntities = albums.stream().map(album-> mapper.getAlbumMapper().map(album)).toList();
        List<Long> sourceAlbumsIds = dataCatalog.getAlbums().findAll().stream().map(entity -> entity.getId()).toList();
        List<Album> albumEntitiesToSave = albumEntities.stream().filter(Predicate.not(entity -> sourceAlbumsIds.contains(entity.getId()))).toList();

        albumEntitiesToSave.forEach(entity ->{
            dataCatalog.getAlbums().save(entity);
        });

        //saving tracks
        List<Track> trackEntities = tracks.stream().map(track -> mapper.getTrackMapper().map(track)).toList();
        List<Long> sourceTrackIds = dataCatalog.getTracks().findAll().stream().map(entity -> entity.getId()).toList();
        List<Track> trackEntitiesToSave = trackEntities.stream().filter(Predicate.not(entity -> sourceTrackIds.contains(entity.getId()))).toList();

        trackEntitiesToSave.forEach(entity->{
            dataCatalog.getTracks().save(entity);
        });

        //saving clips

        List<Clip> clipEntities = clips.stream().map(clip -> mapper.getClipMapper().map(clip)).toList();
        List<String> sourceClipsUrls = dataCatalog.getClips().findAll().stream().map(entity -> entity.getClipUrl()).toList();
        List<Clip> clipEntitiesToSave = clipEntities.stream().filter(Predicate.not(entity -> sourceClipsUrls.contains(entity.getClipUrl()))).toList();

        clipEntitiesToSave.forEach(entity -> {
            dataCatalog.getClips().save(entity);
        });
    }
}
