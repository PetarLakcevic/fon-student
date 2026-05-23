package com.fon.student_tracker.controller;


import com.fon.student_tracker.dto.ModulRequest;
import com.fon.student_tracker.dto.ModulResponse;
import com.fon.student_tracker.service.ModulService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/modul")
public class ModulController {

    private final ModulService modulService;

    /*
    ctrl D - duplicate
    ctrl X - cut
    ctrl alt o l - imports, formatting
    alt insert - generators
    ctrl n - search classes / files
    ctrl shift f - find string
    ctrl shift r - find and replace...
     */

    @PostMapping
    public ModulResponse create(@RequestBody @Valid ModulRequest moduleRequest) {
        log.info("Creating modul {}", moduleRequest);
        return modulService.create(moduleRequest);
    }

    @GetMapping
    public List<ModulResponse> findAll() {
        log.info("Finding all moduls");
        return modulService.findAll();
    }

}
