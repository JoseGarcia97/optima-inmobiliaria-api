package com.optimainmobiliaria.user.controller;

import com.optimainmobiliaria.user.repository.MaritalStatusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/marital-status")
@RequiredArgsConstructor
public class MaritalStatusController {
    private final MaritalStatusRepository maritalStatusRepository;
    @GetMapping
    private ResponseEntity getMaritalStatus(){
        return ResponseEntity.ok(maritalStatusRepository.findAll());
    }
}
