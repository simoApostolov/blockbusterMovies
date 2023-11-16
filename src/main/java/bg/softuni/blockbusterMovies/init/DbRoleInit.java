package bg.softuni.blockbusterMovies.init;

import bg.softuni.blockbusterMovies.service.RoleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DbRoleInit implements CommandLineRunner {

    private final RoleService roleService;

    public DbRoleInit(RoleService roleService) {
        this.roleService = roleService;
    }

    @Override
    public void run(String... args) throws Exception {
        roleService.addRoles();
    }
}
