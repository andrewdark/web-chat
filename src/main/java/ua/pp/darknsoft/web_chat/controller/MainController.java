package ua.pp.darknsoft.web_chat.controller;

import jakarta.annotation.Resource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public ClassPathResource homePage() {
        return new ClassPathResource("build/index.html");
    }
}
