package com.fon.student_tracker.service;

import com.fon.student_tracker.domain.Smer;
import com.fon.student_tracker.repository.SmerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class SmerService {

    private final SmerRepository smerRepository;

    public Smer create(Smer smer) {
        Smer saved = smerRepository.save(smer);
        return saved;
    }

    public List<Smer> findAll() {
        List<Smer> smerovi = smerRepository.findAll();
        return smerovi;
    }

    public Smer findById(Long id) {
        Optional<Smer> smer = smerRepository.findById(id);
        if (smer.isPresent()){
            return smer.get();
        }

        throw new RuntimeException("Smer not found");
    }
}
