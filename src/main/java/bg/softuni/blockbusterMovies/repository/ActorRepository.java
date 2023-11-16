package bg.softuni.blockbusterMovies.repository;

import bg.softuni.blockbusterMovies.model.entity.ActorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ActorRepository extends JpaRepository<ActorEntity, Long> {
}
