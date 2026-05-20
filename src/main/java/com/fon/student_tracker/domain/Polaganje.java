package com.fon.student_tracker.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "polaganje")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Polaganje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "datum_polaganja", nullable = false)
    private LocalDateTime datumPolaganja;

    @Column(nullable = false)
    private int ocena;

    @Column(nullable = false)
    private int bodovi;

    @ManyToOne(optional = false)
    @JoinColumn(name = "predmet_id", nullable = false)
    private Predmet predmet;

    @ManyToOne(optional = false)
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;
}

