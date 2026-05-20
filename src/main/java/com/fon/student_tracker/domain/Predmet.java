package com.fon.student_tracker.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "predmet")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Predmet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String naziv;

    @Column(nullable = false)
    private int espb;

    @Column(nullable = false)
    private int semestar;

    @ManyToOne(optional = false)
    @JoinColumn(name = "katedra_id", nullable = false)
    private Katedra katedra;


}
