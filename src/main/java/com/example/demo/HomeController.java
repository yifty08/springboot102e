package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homepage(Model model) {
        model.addAttribute("myvar", "say hello to my friend");
        model.addAttribute("myvar2", "say hello to my friend again");
        return "hometemplate";
    }
}
