package dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ClipDto {
    @JsonProperty("idTrack")
    private Long trackId;
    @JsonProperty("strArtist")
    private String artistName;
    @JsonProperty("strTrack")
    private String trackName;
    @JsonProperty("intDuration")
    private Integer duration;
    @JsonProperty("strTrackThumb")
    private String trackThumbUrl;
    @JsonProperty("strMusicVid")
    private String clipUrl;
    @JsonProperty("strDescriptionEN")
    private String descriptionEng;
}
