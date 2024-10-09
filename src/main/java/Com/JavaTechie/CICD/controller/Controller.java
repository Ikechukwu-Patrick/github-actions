package Com.JavaTechie.CICD.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String home() {
        return "Welcome to the Github CI/CD Actions Application!!!";
    }
}
