package com.digispike.demo.controller;

import com.digispike.demo.model.User;
import com.digispike.demo.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Devon Ravihansa on 8/21/2017.
 */
@Controller
public class DefaultController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("view", "index");
        return "layouts/default";
    }

    @RequestMapping("/login")
    public String login(Model model){
        model.addAttribute("view", "login");
        return "layouts/default";
    }

    @GetMapping("/add")
    @ResponseBody
    public String addUser(@RequestParam String email, @RequestParam String password){
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        userRepository.save(user);
        return "saved";
    }

    @GetMapping("/all")
    @ResponseBody
    public Iterable<User> allUsers(){
        return userRepository.findAll();
    }
}
