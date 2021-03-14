package com.example.spring_boot_3_1_1.controllers;

import com.example.spring_boot_3_1_1.entity.User;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping()
    public String userService(Model model, Authentication authentication){
        User user = (User) authentication.getPrincipal();
        model.addAttribute("user", user);

        return "user";
    }
}
