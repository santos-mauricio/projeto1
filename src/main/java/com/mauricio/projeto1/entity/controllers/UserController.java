package com.mauricio.projeto1.entity.controllers;

import com.mauricio.projeto1.entity.User;
import com.mauricio.projeto1.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    private UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @RequestMapping("/user")
    public String getUser(Model model) {
        model.addAttribute("userList", this.userRepository.findAll());

        return "user";
    }
}
