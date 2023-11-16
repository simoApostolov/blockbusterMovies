package bg.softuni.blockbusterMovies.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class PicturesEntity extends BaseEntity{
    private String name;
    private String pictureUrl;
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private ActorEntity actorEntity;

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public ActorEntity getActor() {
        return actorEntity;
    }

    public void setActor(ActorEntity actorEntity) {
        this.actorEntity = actorEntity;
    }
}
