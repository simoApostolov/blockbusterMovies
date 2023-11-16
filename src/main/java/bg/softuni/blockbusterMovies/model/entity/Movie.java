package bg.softuni.blockbusterMovies.model.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
@Entity
public class Movie extends BaseEntity{

    private String name;
    private Integer length;
    private LocalDate releaseDate;
    private String description;
    @ManyToOne
    private PicturesEntity picturesEntity;
    private String trailerUrl;
    private Integer rating;
    private BigDecimal budget;
    @OneToMany
    private List<ActorEntity> actorEntities;

    public Movie() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PicturesEntity getPictures() {
        return picturesEntity;
    }

    public void setPictures(PicturesEntity picturesEntity) {
        this.picturesEntity = picturesEntity;
    }

    public String getTrailerUrl() {
        return trailerUrl;
    }

    public void setTrailerUrl(String trailerUrl) {
        this.trailerUrl = trailerUrl;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }
}
