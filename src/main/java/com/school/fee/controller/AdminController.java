package com.school.fee.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {

    @GetMapping("/")
    public String home() {
        return "Gayatri School Fee Management System Running";
    }
}
