package dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TrackDto {
    @JsonProperty("idTrack")
    private Long id;
    @JsonProperty("idAlbum")
    private Long albumId;
    @JsonProperty("strTrack")
    private String trackName;
    @JsonProperty("strAlbum")
    private String albumName;
    @JsonProperty("strArtist")
    private String artistName;
    @JsonProperty("intDuration")
    private Integer duration;
    @JsonProperty("strGenre")
    private String genre;
    @JsonProperty("strDescriptionEN")
    private String descriptionEng;
    @JsonProperty("intTrackNumber")
    private Integer trackNumber;
    @JsonProperty("intTotalPlays")
    private Long totalPlays;
}
