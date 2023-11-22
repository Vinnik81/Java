package com.example.controller.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/home")
public class HomeController {
    @GetMapping("/")
    public ResponseEntity<?> get(@RequestParam(value = "n") String name, @RequestParam(value = "a") int age) {
        return ResponseEntity.ok("Hello " + name + " " + age);
    }

    /*@PostMapping("/")
    public void add() {

    }*/
}
