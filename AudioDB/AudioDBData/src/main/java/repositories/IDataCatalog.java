package repositories;

import org.springframework.stereotype.Repository;

public interface IDataCatalog {
    AlbumRepository getAlbums();
    ArtistRepository getArtists();
    TrackRepository getTracks();
    ClipRepository getClips();
}
