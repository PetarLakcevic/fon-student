package com.fon.student_tracker.service;

import com.fon.student_tracker.domain.Modul;
import com.fon.student_tracker.dto.ModulRequest;
import com.fon.student_tracker.dto.ModulResponse;
import com.fon.student_tracker.repository.ModulRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ModulService {

    private final ModulRepository modulRepository;
    private final SmerService smerService;

    public ModulResponse create(@Valid ModulRequest moduleRequest) {
        Modul saved = modulRepository.save(Modul.from(moduleRequest.naziv(), smerService.findByIdInternal(moduleRequest.smerId())));
        return ModulResponse.from(saved);
    }

    public List<ModulResponse> findAll() {
        return ModulResponse.from(modulRepository.findAll());
    }
}
