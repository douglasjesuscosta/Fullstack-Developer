package com.ecommerceproject.service.user.UserService.controller;

import com.ecommerceproject.service.user.UserService.dto.UserDTO;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 */
@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping
    public ResponseEntity<UserDTO> createUser() {
        return null;
    }
    
}