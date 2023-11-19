package bg.softuni.blockbusterMovies.init;

import bg.softuni.blockbusterMovies.service.GenreService;
import bg.softuni.blockbusterMovies.service.RoleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DbInit implements CommandLineRunner {

    private final RoleService roleService;
    private final GenreService genreService;

    public DbInit(RoleService roleService, GenreService genreService) {
        this.roleService = roleService;
        this.genreService = genreService;
    }

    @Override
    public void run(String... args) throws Exception {
        roleService.addRoles();
        genreService.addGenres();
    }
}
