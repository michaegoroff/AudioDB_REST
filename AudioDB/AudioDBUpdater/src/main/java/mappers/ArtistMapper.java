package mappers;

import dtos.ArtistDto;
import model.Artist;

public class ArtistMapper implements IMapper<Artist, ArtistDto>{

    @Override
    public Artist map(ArtistDto artistDto) {
        return map(new Artist(),artistDto);
    }

    @Override
    public Artist map(Artist artist, ArtistDto artistDto) {
        artist.setId(artistDto.getId());
        artist.setArtistName(artistDto.getArtistName());
        artist.setLabelName(artistDto.getLabelName());
        artist.setFormedYear(artistDto.getFormedYear());
        artist.setBirthYear(artistDto.getBirthYear());
        artist.setDeathYear(artistDto.getDeathYear());
        artist.setDisbanded(artistDto.getDisbanded());
        artist.setArtistGenre(artistDto.getArtistGenre());
        artist.setArtistWebsite(artistDto.getArtistWebsite());
        artist.setArtistFacebook(artistDto.getArtistFacebook());
        artist.setArtistBioEng(artistDto.getArtistBioEng());
        artist.setGender(artistDto.getGender());
        artist.setArtistCountry(artistDto.getArtistCountry());
        artist.setArtistLogoUrl(artistDto.getArtistLogoUrl());
        artist.setTotalMembers(artistDto.getTotalMembers());
        return artist;
    }
}
