package com.fullstackjavacourse.SpringBookTaskAlicia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ActionController {

    @GetMapping("/greeting")
    public String greeting() {
        return "Greeting";
    }

    @GetMapping("/reversed")
    public String reversed(@RequestParam(name="input", required = false, defaultValue = "") String s, Model model) {
        StringBuilder string = new StringBuilder(s);
        String reversed = string.reverse().toString();
        model.addAttribute("reversed", reversed);
        return "Result";
    }
}
