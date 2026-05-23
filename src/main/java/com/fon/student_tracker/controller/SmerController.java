package com.fon.student_tracker.controller;


import com.fon.student_tracker.dto.SmerRequest;
import com.fon.student_tracker.dto.SmerResponse;
import com.fon.student_tracker.service.SmerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/smer")
public class SmerController {

    private final SmerService smerService;

    @PostMapping
    public SmerResponse create(@RequestBody @Valid SmerRequest smerRequest) {
        log.info("Creating smer {}", smerRequest);
        return smerService.create(smerRequest);
    }

    @GetMapping
    public List<SmerResponse> findAll() {
        log.info("Finding all smers");
        return smerService.findAll();
    }

    @GetMapping("/{id}")
    public SmerResponse findById(@PathVariable Long id) {
        log.info("Finding smer by id {}", id);
        return smerService.findById(id);
    }

    /*
    TRACE
    DEBUG
    INFO
    WARN
    ERROR
     */
}
