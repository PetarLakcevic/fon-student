package com.fon.student_tracker.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "smer")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Smer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String naziv;
    //OneToMany List<Modul> moduli;
}
