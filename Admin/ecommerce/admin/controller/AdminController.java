package com.ecommerce.admin.controller;

import com.ecommerce.library.model.Category;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;
import java.util.List;


@Controller
public class AdminController {

    @GetMapping("/error")
    public String error(Model model){
        model.addAttribute("title", "error");
        return "404";
    }
    @GetMapping("/utilities-color")
    public String color(Model model){
        model.addAttribute("title", "Color");
        return "utilities-color";
    }
    @GetMapping("/utilities-border")
    public String border(Model model){
        model.addAttribute("title", "Border");
        return "utilities-border";
    }
    @GetMapping("/utilities-other")
    public String other(Model model){
        model.addAttribute("title", "Other");
        return "utilities-other";
    }
}
