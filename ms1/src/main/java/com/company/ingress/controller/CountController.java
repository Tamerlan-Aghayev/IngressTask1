package com.company.ingress.controller;

import com.company.ingress.service.CountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CountController {
    private final CountService countService;
    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok(countService.addCount());
    }
}
