package bg.softuni.blockbusterMovies.service.impl;

import bg.softuni.blockbusterMovies.model.entity.RoleEntity;
import bg.softuni.blockbusterMovies.model.entity.UserEntity;
import bg.softuni.blockbusterMovies.repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class BlockbusterUserDetailService implements UserDetailsService {

    private final UserRepository userRepository;
    public BlockbusterUserDetailService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepository
                .findByEmail(email)
                .map(BlockbusterUserDetailService::mapUser)
                .orElseThrow(() -> new UsernameNotFoundException("User " + email + " not found"));
    }

    private static UserDetails mapUser(UserEntity userEntity) {
        return User
                .withUsername(userEntity.getEmail())
                .password(userEntity.getPassword())
                .authorities(userEntity.getRoles().stream().map(BlockbusterUserDetailService::mapUser).toList())
                .build();
    }

    private static GrantedAuthority mapUser(RoleEntity role) {
        return new SimpleGrantedAuthority(
                "ROLE_" + role.getRole().name()
        );
    }
}
