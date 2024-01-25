package mappers;

import dtos.TrackDto;
import model.Track;

public class TrackMapper implements IMapper<Track, TrackDto>{
    @Override
    public Track map(TrackDto trackDto) {
        return map(new Track(),trackDto);
    }

    @Override
    public Track map(Track track, TrackDto trackDto) {
        track.setId(trackDto.getId());
        track.setAlbumId(trackDto.getAlbumId());
        track.setTrackName(trackDto.getTrackName());
        track.setAlbumName(trackDto.getAlbumName());
        track.setArtistName(trackDto.getArtistName());
        track.setDuration(trackDto.getDuration());
        track.setGenre(trackDto.getGenre());
        track.setDescriptionEng(trackDto.getDescriptionEng());
        track.setTrackNumber(trackDto.getTrackNumber());
        track.setTotalPlays(trackDto.getTotalPlays());
        return track;
    }
}
