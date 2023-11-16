package bg.softuni.blockbusterMovies.model.dto;

import bg.softuni.blockbusterMovies.model.entity.enums.GenderEnum;
import jakarta.validation.constraints.*;

public class UserRegistrationDTO {

    @Size(min = 3, max = 20, message = "First name must be between 3 and 20 characters!")
    @NotEmpty
    private String firstName;
    @Size(min = 3, max = 20, message = "Last name must be between 3 and 20 characters!")
    @NotEmpty
    private String lastName;
    @Email
    @NotEmpty
    private String email;
    @Size(min = 4, max = 20, message = "Password must be at least 4 characters long!")
    @NotEmpty
    private String password;
    @Size(min = 4, max = 20)
    @NotEmpty
    private String confirmPassword;
    @Positive
    @NotNull
    private Integer age;
    @NotNull
    private GenderEnum gender;

    public UserRegistrationDTO() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
