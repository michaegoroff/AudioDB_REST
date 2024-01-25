package dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ClipListDto {
    @JsonProperty("mvids")
    List<ClipDto> clips;
}
