package com.example.gradeerWeb.gradeerConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GradeerConfigController {
    @Autowired
    private GradeerConfigService service;

    @GetMapping("/gradeerConfig")
    public String showGradeerConfigPage() {
        return "gradeer-config";
    }

}
