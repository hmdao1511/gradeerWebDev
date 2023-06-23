package com.example.gradeerWeb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {
    @GetMapping("")
    public String showGradeerWebHomepage() {
        return "index";
    }
}
