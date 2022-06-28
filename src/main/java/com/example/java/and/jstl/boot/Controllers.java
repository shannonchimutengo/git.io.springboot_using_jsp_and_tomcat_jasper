package com.example.java.and.jstl.boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class Controllers {

@GetMapping("home")

    public String show(HttpServletRequest request, HttpServletResponse response) throws IOException {

    String  username = request.getParameter("name");
    HttpSession session = request.getSession();

    session.setAttribute("name",username);
        return"home";
    }
}
