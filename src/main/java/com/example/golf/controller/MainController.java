package com.example.golf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/golf")
    public String showMainView() {
        return "main";
    }
}
