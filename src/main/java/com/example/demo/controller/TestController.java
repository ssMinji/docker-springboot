package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
@RequestMapping("/api")
public class TestController {
	@GetMapping("/v1/hello")
    public ResponseEntity<Object> testApiV1() {
        String result = "I'm BLUE.";
        return new ResponseEntity<>(result, HttpStatus.OK);
    }	

    @GetMapping("/v2/hello")
    public ResponseEntity<Object> testApiV2() {
        String result = "I'm GREEN.";
        return new ResponseEntity<>(result, HttpStatus.OK);
    }		
}
