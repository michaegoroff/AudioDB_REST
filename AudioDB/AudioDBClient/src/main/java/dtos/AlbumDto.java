package dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AlbumDto {
    @JsonProperty("idAlbum")
    private Long id;
    @JsonProperty("idArtist")
    private Long artistId;
    @JsonProperty("strAlbum")
    private String albumName;
    @JsonProperty("strArtist")
    private String artistName;
    @JsonProperty("intYearReleased")
    private Integer releaseYear;
    @JsonProperty("strGenre")
    private String albumGenre;
    @JsonProperty("strLabel")
    private String labelName;
    @JsonProperty("strAlbumThumb")
    private String thumbUrl;
    @JsonProperty("strDescriptionEN")
    private String descriptionEng;
}
