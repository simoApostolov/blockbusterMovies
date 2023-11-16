package bg.softuni.blockbusterMovies.repository;

import bg.softuni.blockbusterMovies.model.entity.PicturesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureRepository extends JpaRepository<PicturesEntity, Long> {
}
