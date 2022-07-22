package com.code.controllers.login.registrationController;

import com.code.repo.user.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    @Autowired
    UserRepo userRepo;

    @GetMapping("/registration")
    public String getRegistration(Model model) {
        return "pages/login/registration";
    }

    @PostMapping("/registration")
    public String postReg(Model model) {
        return "redirect: /login";
    }
}
