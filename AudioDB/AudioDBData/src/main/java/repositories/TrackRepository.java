package repositories;

import model.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface TrackRepository extends JpaRepository<Track,Long> {
}
