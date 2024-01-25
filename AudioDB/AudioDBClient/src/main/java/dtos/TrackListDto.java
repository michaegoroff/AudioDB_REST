package dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class TrackListDto {
    @JsonProperty("track")
    List<TrackDto> tracks;
}
