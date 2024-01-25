package repositories;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Getter
@RequiredArgsConstructor
public class DataCatalog implements IDataCatalog {
    @Autowired
    private final ArtistRepository artists;
    @Autowired
    private final AlbumRepository albums;
    @Autowired
    private final TrackRepository tracks;
    @Autowired
    private final ClipRepository clips;
}
