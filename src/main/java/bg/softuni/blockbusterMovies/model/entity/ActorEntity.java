package bg.softuni.blockbusterMovies.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class ActorEntity extends BaseEntity{
    private String fullName;
    private Integer age;
    private String info;
    @ManyToOne
    private Movie movieList;
    @ManyToOne
    private PicturesEntity picturesEntity;

    public ActorEntity() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Movie getMovieList() {
        return movieList;
    }

    public void setMovieList(Movie movieList) {
        this.movieList = movieList;
    }

    public PicturesEntity getPictures() {
        return picturesEntity;
    }

    public void setPictures(PicturesEntity picturesEntity) {
        this.picturesEntity = picturesEntity;
    }
}
