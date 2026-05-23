package com.fon.student_tracker.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record SmerRequest(
        @NotBlank(message = "Naziv is required")
        @Size(max = 50, message = "Naziv should not exceed 50 chars")
        String naziv) {
}
