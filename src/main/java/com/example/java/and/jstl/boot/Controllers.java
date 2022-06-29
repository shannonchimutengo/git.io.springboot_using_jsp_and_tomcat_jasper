package com.example.java.and.jstl.boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controllers {

@GetMapping("home")

    public ModelAndView show(@RequestParam("username") String name) {

    ModelAndView modelAndView =  new ModelAndView();
    modelAndView.addObject("name",name);
    modelAndView.setViewName("home");

        return modelAndView;
    }
}
