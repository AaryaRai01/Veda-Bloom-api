package com.vedabloom.api.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// This line acts as a security guard, allowing ONLY your Vercel frontend to talk to this backend
@CrossOrigin(origins = "https://veda-bloom-prp.vercel.app")
public class HelloController {

    @GetMapping("/api/test")
    public String testConnection() {
        return "Backend is Live and Connected!";
    }
}