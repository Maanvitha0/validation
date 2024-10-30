package com.example.validation.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.validation.dto.UserDTO;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
@Validated
public class UserController {
    @PostMapping
   public ResponseEntity<String> createUser(@Valid @RequestBody UserDTO userDTO) {
        // Process valid user
        return ResponseEntity.ok("User created successfully");
    }
}