package com.example.demospringbooticc706.controllers;
import com.example.demospringbooticc706.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("usuarios", userRepository.findAll());


        return "index";
    }

    @RequestMapping("/registrarse")
    public String registro(){

        return "registro";
    }
}
