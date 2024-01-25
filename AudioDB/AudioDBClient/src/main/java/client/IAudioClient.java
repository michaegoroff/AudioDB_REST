package client;

import dtos.*;

import java.util.List;

public interface IAudioClient {
    ArtistDto getArtistById(Long id);
    AlbumDto getAlbumById(Long id);
    TrackDto getTrackById(Long id);

    List<ClipDto> getAllClipsByArtistId(Long id);

    List<AlbumDto> getAllAlbumsByArtistName(String name);

    List<TrackDto> getAllTracksByAlbumId(Long id);

    List<AlbumDto> getAllAlbumsByArtistId(Long id);
}
