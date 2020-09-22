package com.devteam.week2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    String appName = "Saqib SQL";
 
    @GetMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "week1/home";
    }
}