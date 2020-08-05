package com.fullstackjavacourse.SpringBookTaskAlicia.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionController {

    @GetMapping("/greeting")
    public String greeting() {
        return "Hi there!";
    }

    @GetMapping("/reversed")
    public String reversed(@RequestParam(name="input") String s) {
        StringBuilder string = new StringBuilder(s);
        return string.reverse().toString();
    }
}
