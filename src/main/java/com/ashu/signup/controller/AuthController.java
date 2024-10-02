package com.ashu.signup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import com.ashu.signup.model.User;
import com.ashu.signup.service.UserService;

@Controller
public class AuthController {
    
    @Autowired
    private UserService userService;

    @GetMapping({"/signup","/"})
    public String showSignupForm(){
        return "signup";
    }

    @PostMapping("/signup")
    public String signUp(@RequestParam String username, @RequestParam String password , Model model){
        User newUser = new User();
        newUser.setUsername(username);
        newUser.setPassword(password);
        userService.saveUser(newUser);
        model.addAttribute("successMessage","user Registered Successfully");
        return "login";
    }

    @GetMapping("/login")
    public String showLoginForm(){
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username , @RequestParam String password, Model model){
        if(userService.validateUser(username, password)){
            return "redirect:/success";
        }
        else {
            model.addAttribute("errorMessage", "Invalid Credentials");
            return "login";
        }
    }
    @GetMapping("/success")
    public String showSuccessPage(){
        return "success";
    }
}
