package com.fon.student_tracker.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record ModulRequest(
        @NotBlank(message = "Naziv is required")
        @Size(max = 50, message = "Naziv should not exceed 50 chars")
        String naziv,
        @NotNull(message = "Smer is required")
        Long smerId) {
}
