package bg.softuni.blockbusterMovies.model.entity;

import bg.softuni.blockbusterMovies.model.entity.enums.GenderEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Positive;
import org.hibernate.validator.constraints.Length;

import java.util.ArrayList;
import java.util.List;

@Entity
public class UserEntity extends BaseEntity {
    @Column(nullable = false)
    @Length(min = 2, max = 20)
    private String firstName;
    @Column(nullable = false)
    @Length(min = 3, max = 20)
    private String lastName;
    @Email
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @Positive
    private Integer age;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private GenderEnum gender;
    @ManyToMany(fetch = FetchType.EAGER)
    @Column(nullable = false)
    private List<RoleEntity> roles = new ArrayList<>();

    public UserEntity() {
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public List<RoleEntity> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleEntity> roles) {
        this.roles = roles;
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
    public void addRole(RoleEntity role) {
        this.roles.add(role);
    }
}
