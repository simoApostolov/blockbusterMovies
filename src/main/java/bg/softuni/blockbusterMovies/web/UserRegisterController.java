package bg.softuni.blockbusterMovies.web;

import bg.softuni.blockbusterMovies.model.dto.UserRegistrationDTO;
import bg.softuni.blockbusterMovies.service.UserService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/users")
public class UserRegisterController {

    private final UserService userService;

    public UserRegisterController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String register() {
        return "auth-register";
    }

    @PostMapping("register")
    public String registerUser(@Valid UserRegistrationDTO userRegistrationDTO,
                               BindingResult bindingResult,
                               RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("userRegistrationDTO", userRegistrationDTO);
            redirectAttributes
                    .addFlashAttribute("org.springframework.validation.BindingResult.userRegistrationDTO", bindingResult);

            return "redirect:register";
        }

        userService.registerUser(userRegistrationDTO);

        return "redirect:/login";
    }

    @ModelAttribute
    public UserRegistrationDTO initUserRegistrationDTO() {
        return new UserRegistrationDTO();
    }
}
