package com.example.java.and.jstl.boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
=======
>>>>>>> 3c6b606 (updated pom.xml for gitpod to run)

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
