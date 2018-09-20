package com.gfa.useful_things.controllers;

import com.gfa.useful_things.services.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulController {

    public UsefulController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    UtilityService utilityService;


    @RequestMapping("/useful")
    public String useful() {
        return ("useful");
    }

    @RequestMapping("/useful/colored")
    public String color(Model model) {
        model.addAttribute("color", utilityService.randomColor());
        return ("colored");
    }

    @RequestMapping("/useful/email")
    public String email(Model model, @RequestParam("email") String emailAddress) {
        Boolean valid = false;
        if (utilityService.validateEmail(emailAddress)) {
            valid = true;
        }
        model.addAttribute("validhtml", valid);
        model.addAttribute("emailhtml", emailAddress);
        return ("email");
    }

    @RequestMapping("/useful/caesar")
    public String caesar() {
        return ("useful");
    }
}
