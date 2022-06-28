package com.example.java.and.jstl.boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

@Controller
public class Controllers {

@GetMapping("home")

    public String show(HttpServletRequest request){
String  username = request.getParameter("name");
    HttpSession session = request.getSession();
    session.setAttribute("name",username);
        return"home";
    }
}
