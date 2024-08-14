package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
@RequestMapping("/api/v1/test")
public class TestController {
	@GetMapping("/hello")
    public ResponseEntity<Object> testApi() {
        String result = "I'm GREEN.";
        return new ResponseEntity<>(result, HttpStatus.OK);
    }		
}