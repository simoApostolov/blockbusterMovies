package bg.softuni.blockbusterMovies.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;
@Entity
public class Actor extends BaseEntity{
    private String fullName;
    private Integer age;
    private String info;
    @ManyToOne
    private Movie movieList;
    @ManyToOne
    private Pictures pictures;

    public Actor() {
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

    public Pictures getPictures() {
        return pictures;
    }

    public void setPictures(Pictures pictures) {
        this.pictures = pictures;
    }
}
