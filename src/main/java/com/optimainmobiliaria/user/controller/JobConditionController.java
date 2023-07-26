package com.optimainmobiliaria.user.controller;

import com.optimainmobiliaria.user.repository.JobConditionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/job-conditions")
@RequiredArgsConstructor
public class JobConditionController {
    private final JobConditionRepository jobConditionRepository;

    @GetMapping
    private ResponseEntity getJobConditions(){
        return ResponseEntity.ok(jobConditionRepository.findAll());
    }
}
