package bg.softuni.blockbusterMovies.model.entity;

import bg.softuni.blockbusterMovies.model.entity.enums.GenreEnum;
import jakarta.persistence.*;

@Entity
@Table
public class Genre extends BaseEntity{
    @Enumerated(EnumType.STRING)
    @Column
    private GenreEnum name;


    public GenreEnum getName() {
        return name;
    }

    public void setName(GenreEnum name) {
        this.name = name;
    }
}
