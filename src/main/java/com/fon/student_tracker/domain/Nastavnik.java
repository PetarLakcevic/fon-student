package com.fon.student_tracker.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "nastavnik")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Nastavnik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String ime;

    @Column(nullable = false)
    private String prezime;

    @ManyToOne(optional = false)
    @JoinColumn(name = "katedra_id", nullable = false)
    private Katedra katedra;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Zvanje zvanje;


}
