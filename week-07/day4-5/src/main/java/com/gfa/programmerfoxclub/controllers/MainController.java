package com.gfa.programmerfoxclub.controllers;

import com.gfa.programmerfoxclub.services.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    FoxService foxService;

    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }

    @RequestMapping("/")
    public String root(@RequestParam String name, Model model) {
        if (name.length()<1 || foxService.isNewFox(name)){
            return "redirect:/login";
        }
            model.addAttribute("name", name);

        return "index";
    }

    @RequestMapping("/login")
    public String login(Model model) {
        // model.addAttribute("name", "rokanev");
        return "login";
    }

    @PostMapping("/login")
    public String loginName(@RequestParam String name, Model model) {
        if (foxService.isNewFox(name)) {
            foxService.addFox(name);
            //          return "redirect:/?name=" + name;
        }
        //      model.addAttribute("error", "Fox exists already. Give another name.");
        return "redirect:/?name=" + name;
    }


    @RequestMapping("/nutritionStore")

    public String nutrition(@RequestParam String name, Model model) {
        if (name.length()<1 || foxService.isNewFox(name)) {
            return "redirect:/login";
        }
        model.addAttribute("name", name);
        return "index";
    }

    @RequestMapping("/trickCenter")

    public String trickCenter(@RequestParam String name, Model model) {
        if (name.length()<1 || foxService.isNewFox(name)) {
            return "redirect:/login";
        }
        model.addAttribute("name", name);
        return "index";
    }

    @RequestMapping("/actionHistory")

    public String actionHistory(@RequestParam String name, Model model) {
        if (foxService.isNewFox(name)) {
            return "redirect:/login";
        }
        model.addAttribute("name", name);
        return "index";
    }
}
