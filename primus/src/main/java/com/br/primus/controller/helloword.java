package com.br.primus.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController


public class helloword {

    @GetMapping("/")
    public String getMethodName() {
        return "Olá Mundo";
    }
    
}
