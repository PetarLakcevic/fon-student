package com.fon.student_tracker.controller;


import com.fon.student_tracker.domain.Smer;
import com.fon.student_tracker.service.SmerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/smer")
public class SmerController {

    private final SmerService smerService;

    @PostMapping
    public Smer create(@RequestBody Smer smer) {
        return smerService.create(smer);
    }

    @GetMapping
    public List<Smer> findAll() {
        return smerService.findAll();
    }

    @GetMapping("/{id}")
    public Smer findById(@PathVariable Long id) {
        return smerService.findById(id);
    }


}
