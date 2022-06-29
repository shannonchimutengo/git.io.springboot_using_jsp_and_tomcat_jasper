package com.example.java.and.jstl.boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controllers {

@GetMapping("home")

    public ModelAndView show(Student student) {

    ModelAndView modelAndView =  new ModelAndView();
    modelAndView.addObject("obj",student);
    modelAndView.setViewName("home");

        return modelAndView;
    }
}
