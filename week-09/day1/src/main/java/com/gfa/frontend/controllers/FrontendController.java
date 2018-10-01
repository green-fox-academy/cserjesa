package com.gfa.frontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FrontendController {

    @GetMapping("/")
    public String actionHistory(@RequestParam(required = false) String name, Model model) {
              return "index";
    }
}
