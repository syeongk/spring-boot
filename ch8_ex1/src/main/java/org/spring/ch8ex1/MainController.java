package org.spring.ch8ex1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("name", "Katy");
        model.addAttribute("color", "red");
        return "home.html";
    }
}
