package dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class AlbumListDto {
    @JsonProperty("album")
    List<AlbumDto> albums;
}
