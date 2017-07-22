package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Starter controller loads the index.jsp
 * to start the application correctly
 */
@RestController
public class StarterController {

    @RequestMapping("/")
    public String loadIndex(){
        return "index";
    }

}
