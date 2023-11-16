package bg.softuni.blockbusterMovies.repository;

import bg.softuni.blockbusterMovies.model.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
}
