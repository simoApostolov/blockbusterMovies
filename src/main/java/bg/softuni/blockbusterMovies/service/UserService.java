package bg.softuni.blockbusterMovies.service;

import bg.softuni.blockbusterMovies.model.dto.UserRegistrationDTO;

public interface UserService {
    boolean registerUser(UserRegistrationDTO userRegistrationDTO);
}
