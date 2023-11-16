package bg.softuni.blockbusterMovies.repository;

import bg.softuni.blockbusterMovies.model.entity.RoleEntity;
import bg.softuni.blockbusterMovies.model.entity.UserEntity;
import bg.softuni.blockbusterMovies.model.entity.enums.RoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {

    Optional<RoleEntity> findByRole(RoleEnum roleEnum);
}
