package mappers;


public interface IMapperCatalog {
    ArtistMapper getArtistMapper();
    AlbumMapper getAlbumMapper();
    TrackMapper getTrackMapper();
    ClipMapper getClipMapper();
}
