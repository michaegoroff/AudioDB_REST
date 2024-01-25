package mappers;

import dtos.AlbumDto;
import model.Album;

public class AlbumMapper implements IMapper<Album, AlbumDto>{
    @Override
    public Album map(AlbumDto albumDto) {
        return map(new Album(),albumDto);
    }

    @Override
    public Album map(Album album, AlbumDto albumDto) {
        album.setId(albumDto.getId());
        album.setArtistId(albumDto.getArtistId());
        album.setAlbumName(albumDto.getAlbumName());
        album.setArtistName(albumDto.getArtistName());
        album.setReleaseYear(albumDto.getReleaseYear());
        album.setAlbumGenre(albumDto.getAlbumGenre());
        album.setLabelName(albumDto.getLabelName());
        album.setThumbUrl(albumDto.getThumbUrl());
        album.setDescriptionEng(albumDto.getDescriptionEng());
        return album;
    }
}
