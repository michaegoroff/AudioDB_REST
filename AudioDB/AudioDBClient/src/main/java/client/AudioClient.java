package client;

import dtos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class AudioClient implements IAudioClient {

    private String hostUrl;
    private String apiKey;
    private String apiVersion;
    @Autowired
    private IAudioClientSettings settings;
    private RestTemplate restTemplate;

    public AudioClient(IAudioClientSettings settings){
        this.settings =settings;
        this.restTemplate = new RestTemplate();
        this.hostUrl = settings.getHostUrl();
        this.apiKey = settings.getApiKey();
        this.apiVersion = settings.getApiVersion();
    }


    @Override
    public ArtistDto getArtistById(Long id) {
        String url = settings.getUriBuilder()
                .pathSegment("artist.php")
                .queryParam("i",id)
                .build().toUriString();
        ArtistListDto response = restTemplate.getForObject(
                url,
                ArtistListDto.class
        );
        try{
            return response.getArtists().get(0);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public AlbumDto getAlbumById(Long id) {
        String url = settings.getUriBuilder()
                .pathSegment("album.php")
                .queryParam("m",id)
                .build().toUriString();
        AlbumListDto response = restTemplate.getForObject(
                url,
                AlbumListDto.class
        );
        try {
            return response.getAlbums().get(0);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public TrackDto getTrackById(Long id) {
        String url = settings.getUriBuilder()
                .pathSegment("track.php")
                .queryParam("h",id)
                .build().toUriString();
        TrackListDto response = restTemplate.getForObject(
                url,
                TrackListDto.class
        );
        try{
            return response.getTracks().get(0);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<ClipDto> getAllClipsByArtistId(Long id) {
        String url = settings.getUriBuilder()
                .pathSegment("mvid.php")
                .queryParam("i",id)
                .build().toUriString();
        ClipListDto response = restTemplate.getForObject(
                url,
                ClipListDto.class
        );
        try{
            return response.getClips();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<AlbumDto> getAllAlbumsByArtistName(String name) {
        String url = settings.getUriBuilder()
                .pathSegment("searchalbum.php")
                .queryParam("s",name)
                .build().toUriString();
        AlbumListDto response = restTemplate.getForObject(
                url,
                AlbumListDto.class
        );
        try{
            return response.getAlbums();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<TrackDto> getAllTracksByAlbumId(Long id) {
        String url = settings.getUriBuilder()
                .pathSegment("track.php")
                .queryParam("m",id)
                .build().toUriString();
        TrackListDto response = restTemplate.getForObject(
                url,
                TrackListDto.class
        );
        try {
            return response.getTracks();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<AlbumDto> getAllAlbumsByArtistId(Long id) {
        String url = settings.getUriBuilder()
                .pathSegment("album.php")
                .queryParam("i",id)
                .build().toUriString();
        AlbumListDto response = restTemplate.getForObject(
                url,
                AlbumListDto.class
        );
        try{
            return response.getAlbums();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
