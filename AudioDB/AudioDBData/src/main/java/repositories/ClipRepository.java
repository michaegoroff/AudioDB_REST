package repositories;

import model.Clip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ClipRepository extends JpaRepository<Clip,Long> {
}
