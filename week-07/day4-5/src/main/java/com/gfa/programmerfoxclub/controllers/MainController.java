package com.gfa.programmerfoxclub.controllers;

import com.gfa.programmerfoxclub.models.Fox;
import com.gfa.programmerfoxclub.services.FoodService;
import com.gfa.programmerfoxclub.services.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    private FoxService foxService;
    private FoodService foodService;

    public MainController(FoxService foxService, FoodService foodService) {
        this.foxService = foxService;
        this.foodService = foodService;
    }

    @GetMapping("/")
    public String root(@RequestParam(required = false) String name, Model model) {
        if (notGoodParam(name)) return "redirect:/login";
        Fox fox = foxService.getFoxByName(name);
        model.addAttribute("fox", fox);
        return "index";
    }

    @GetMapping("/login")
    public String login(@RequestParam(required = false) String name, Model model) {
        if (name != null) {
            if (name.equals("null")) {
                model.addAttribute("error", "You have provided a name that has not been used before, add it as a new one!");
                return "login";
            }
        }
        Fox fox = foxService.getFoxByName(name);
        model.addAttribute("fox", fox);
        return "login";
    }

    @PostMapping("/login")
    public String loginName(@RequestParam(required = false) String name, Model model) {
        if (foxService.isNewFox(name)) {
            foxService.addFox(name);
        }
        return "redirect:/?name=" + name;
    }


    @GetMapping("/trickCenter")

    public String trickCenter(@RequestParam(required = false) String name, Model model) {
        if (notGoodParam(name)) return "redirect:/login";
        Fox fox = foxService.getFoxByName(name);
        model.addAttribute("fox", fox);
        return "index";
    }

    @GetMapping("/actionHistory")
    public String actionHistory(@RequestParam(required = false) String name, Model model) {
        if (notGoodParam(name)) return "redirect:/login";
        Fox fox = foxService.getFoxByName(name);
        model.addAttribute("fox", fox);
        return "index";
    }

    @GetMapping("/nutritionStore")
    public String nutrition(@RequestParam(required = false) String name, Model model) {
        if (notGoodParam(name)) return "redirect:/login?name=null";
        Fox fox = foxService.getFoxByName(name);
        model.addAttribute("fox", fox);
        model.addAttribute("foodlist", foodService.getFoodList());
        return "nutritionStore";
    }

    private boolean notGoodParam(String name) {
        if (name == null || foxService.isNewFox(name)) {
            return true;
        }
        return false;
    }
}
