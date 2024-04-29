package com.example.golf.controller;

import com.example.golf.dto.GolfClassDto;
import com.example.golf.service.RegisterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/golf")
public class RegisterController {
    private final RegisterService registerService;

    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }

    @GetMapping("/registerclass")
    public String showRegisterClassView(Model model) {
        model.addAttribute("dto", new GolfClassDto());
        return "register_class";
    }

    @PostMapping("/registerclass")
    public String registerClass(@ModelAttribute("dto") GolfClassDto golfClassDto) {
        registerService.registerClass(golfClassDto);
        return "redirect:/golf";
    }
}
