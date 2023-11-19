package bg.softuni.blockbusterMovies.service.impl;

import bg.softuni.blockbusterMovies.model.entity.GenreEntity;
import bg.softuni.blockbusterMovies.model.entity.enums.GenreEnum;
import bg.softuni.blockbusterMovies.repository.GenreRepository;
import bg.softuni.blockbusterMovies.service.GenreService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GenreServiceImpl implements GenreService {
    private final GenreRepository genreRepository;

    public GenreServiceImpl(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @Override
    public void addGenres() {
        if (genreRepository.count() == 0) {

            List<GenreEntity> genres = new ArrayList<>();

            Arrays.stream(GenreEnum.values())
                    .forEach(genre -> {
                        GenreEntity genreEntity = new GenreEntity();
                        genreEntity.setName(genre);

                        genres.add(genreEntity);
                    });

            genreRepository.saveAll(genres);
        }
    }
}
