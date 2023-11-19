package bg.softuni.blockbusterMovies.model.entity;

import bg.softuni.blockbusterMovies.model.entity.enums.GenreEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "movies")
public class MovieEntity extends BaseEntity{
    @Column(nullable = false)
    @NotEmpty
    private String title;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private GenreEnum genre;
    @ManyToOne(fetch = FetchType.EAGER)
    private DirectorEntity director;
    @Column(nullable = false)
    private LocalDate yearOfRelease;
    @Column(columnDefinition = "text")
    private String description;
    private Double rating;
    private String posterUrl;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<ActorEntity> actors;
    @OneToMany(mappedBy = "movie", fetch = FetchType.EAGER)
    private List<ReviewEntity> reviews;

    public MovieEntity() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GenreEnum getGenre() {
        return genre;
    }

    public void setGenre(GenreEnum genre) {
        this.genre = genre;
    }

    public DirectorEntity getDirector() {
        return director;
    }

    public void setDirector(DirectorEntity director) {
        this.director = director;
    }

    public LocalDate getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(LocalDate yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public List<ActorEntity> getActors() {
        return actors;
    }

    public void setActors(List<ActorEntity> actors) {
        this.actors = actors;
    }

    public List<ReviewEntity> getReviews() {
        return reviews;
    }

    public void setReviews(List<ReviewEntity> reviews) {
        this.reviews = reviews;
    }
}
