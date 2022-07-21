package com.code.controllers.login.registrationController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {
    @GetMapping("/reg")
    public String getRegistration(Model model) {
        return "pages/login/registration";
    }
}
