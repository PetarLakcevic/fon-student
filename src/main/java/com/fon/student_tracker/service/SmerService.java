package com.fon.student_tracker.service;

import com.fon.student_tracker.domain.Smer;
import com.fon.student_tracker.dto.SmerRequest;
import com.fon.student_tracker.dto.SmerResponse;
import com.fon.student_tracker.repository.SmerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class SmerService {

    private final SmerRepository smerRepository;

    public SmerResponse create(SmerRequest smerRequest) {
        Smer smer = new Smer();
        smer.setNaziv(smerRequest.naziv()); //TODO: extract at home

        return SmerResponse.from(smerRepository.save(smer));
    }

    public List<SmerResponse> findAll() {
        return SmerResponse.from(smerRepository.findAll());
    }

    public SmerResponse findById(Long id) {
        return SmerResponse.from(findByIdInternal(id));
    }

    public Smer findByIdInternal(Long id) {
        Optional<Smer> smer = smerRepository.findById(id);
        if (smer.isPresent()) {
            return smer.get();
        }

        throw new RuntimeException("Smer not found");
    }


}
