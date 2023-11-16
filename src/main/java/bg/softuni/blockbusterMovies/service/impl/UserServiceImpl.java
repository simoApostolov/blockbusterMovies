package bg.softuni.blockbusterMovies.service.impl;

import bg.softuni.blockbusterMovies.model.dto.UserRegistrationDTO;
import bg.softuni.blockbusterMovies.model.entity.UserEntity;
import bg.softuni.blockbusterMovies.model.entity.enums.RoleEnum;
import bg.softuni.blockbusterMovies.repository.RoleRepository;
import bg.softuni.blockbusterMovies.repository.UserRepository;
import bg.softuni.blockbusterMovies.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public boolean registerUser(UserRegistrationDTO userRegistrationDTO) {

        if (!userRegistrationDTO.getPassword().equals(userRegistrationDTO.getConfirmPassword())) {
            return false;
        }

        Optional<UserEntity> findByEmail = userRepository.findByEmail(userRegistrationDTO.getEmail());

        if (findByEmail.isPresent()) {
            return false;
        }

        userRepository.save(map(userRegistrationDTO));

        return true;
    }

    private  UserEntity map(UserRegistrationDTO userRegistrationDTO) {

        UserEntity newUserEntity = new UserEntity();
        newUserEntity.setFirstName(userRegistrationDTO.getFirstName());
        newUserEntity.setLastName(userRegistrationDTO.getLastName());
        newUserEntity.setAge(userRegistrationDTO.getAge());
        newUserEntity.setEmail(userRegistrationDTO.getEmail());
        newUserEntity.setGender(userRegistrationDTO.getGender());
        newUserEntity.setPassword(passwordEncoder.encode(userRegistrationDTO.getPassword()));
        newUserEntity.addRole(roleRepository.findByRole(RoleEnum.USER).get());


        return  newUserEntity;
    }
}
