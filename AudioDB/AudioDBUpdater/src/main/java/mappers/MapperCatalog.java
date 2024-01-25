package mappers;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class MapperCatalog implements IMapperCatalog{
    ArtistMapper artistMapper = new ArtistMapper();
    AlbumMapper albumMapper = new AlbumMapper();
    TrackMapper trackMapper = new TrackMapper();
    ClipMapper clipMapper = new ClipMapper();
}
