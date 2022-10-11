package br.com.eduardon.regescweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloControler {
    @GetMapping("/hello")
    public String hello(){
        System.out.println("**************************");
        return "hello";
    }
}
