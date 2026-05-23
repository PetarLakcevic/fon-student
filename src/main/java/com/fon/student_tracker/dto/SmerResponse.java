package com.fon.student_tracker.dto;

import com.fon.student_tracker.domain.Smer;

import java.util.ArrayList;
import java.util.List;

public record SmerResponse(Long id, String naziv) {

    public static SmerResponse from(Smer smer) {
        return new SmerResponse(smer.getId(), smer.getNaziv());
    }

    public static List<SmerResponse> from(List<Smer> smers) {
        List<SmerResponse> smerResponses = new ArrayList<>();
        for (Smer smer : smers) {
            smerResponses.add(new SmerResponse(smer.getId(), smer.getNaziv()));
        }
        return smerResponses;
    }

}
