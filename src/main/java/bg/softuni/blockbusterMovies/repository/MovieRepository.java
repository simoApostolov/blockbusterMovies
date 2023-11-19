package bg.softuni.blockbusterMovies.repository;

import bg.softuni.blockbusterMovies.model.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, Long> {
}
