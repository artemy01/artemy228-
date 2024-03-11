package com.example.artemy.controllers;

import com.example.artemy.models.User;
import com.example.artemy.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    @PostMapping("/registration")
    public String createUser(User user, Model model) {
        if (!userService.createUser(user)){
            model.addAttribute("errorMessage","Пользователь с email:"+user.getEmail()+"уже существует");
            return "registration";
        }
        userService.createUser(user);
        return "redirect:/login";

    }
    @GetMapping("/hello niger")
    public String securityUrl(){
        return "hello";
    }
}






