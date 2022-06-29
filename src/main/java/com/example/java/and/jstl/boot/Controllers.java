package com.example.java.and.jstl.boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controllers {

@GetMapping("home")

    public String show(){
        return"home";
    }
}
