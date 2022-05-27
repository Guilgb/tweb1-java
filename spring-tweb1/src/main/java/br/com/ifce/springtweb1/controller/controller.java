package br.com.ifce.springtweb1.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
    
    @GetMapping("/hello")
    public String hello(HttpServletRequest request){
        request.setAttribute("nome", "world");
        return "hello";
    }
}
