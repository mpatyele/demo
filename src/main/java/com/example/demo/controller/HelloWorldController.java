package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/demo")
@RestController
public class HelloWorldController {

    @GetMapping
    public ResponseEntity<?> getHelloWorld() {
        return new ResponseEntity<>("Hello world", HttpStatus.OK);
    }
}
