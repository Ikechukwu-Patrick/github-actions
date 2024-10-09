package Com.JavaTechie.CICD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCICDActionsApplication {
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the Github CI/CD Actions Application!";
    }



        public static void main(String[] args){
            SpringApplication.run(GithubCICDActionsApplication.class, args);
        }

    }

