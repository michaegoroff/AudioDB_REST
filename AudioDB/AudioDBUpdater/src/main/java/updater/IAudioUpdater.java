package updater;

public interface IAudioUpdater {
    void updateAllAlbumsByArtistName(String name);

    void updateAllInfoByArtistId(Long id);

}
