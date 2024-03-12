package fr.dejtech.dejtechdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    
    @GetMapping("/")
    String welcome() {
        return "Bienvenue dans ce Déj Tech Docker";
    }

}
