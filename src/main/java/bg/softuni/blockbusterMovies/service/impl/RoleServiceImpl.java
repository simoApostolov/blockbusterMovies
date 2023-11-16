package bg.softuni.blockbusterMovies.service.impl;

import bg.softuni.blockbusterMovies.model.entity.RoleEntity;
import bg.softuni.blockbusterMovies.model.entity.enums.RoleEnum;
import bg.softuni.blockbusterMovies.repository.RoleRepository;
import bg.softuni.blockbusterMovies.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void addRoles() {
        if (roleRepository.count() == 0) {

            List<RoleEntity> roles = new ArrayList<>();

            Arrays.stream(RoleEnum.values())
                    .forEach(role -> {
                        RoleEntity roleEntity = new RoleEntity();
                        roleEntity.setRole(role);

                        roles.add(roleEntity);
                    });

            roleRepository.saveAll(roles);
        }
    }
}
