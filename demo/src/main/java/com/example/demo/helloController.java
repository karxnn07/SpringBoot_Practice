package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @GetMapping("hello")
    public String hello() {
        return "<h1>Hello World</h1>";
    }

    @GetMapping("bye")
    public String greetBye() {
        return "<h1>bye</h1>";
    }
}