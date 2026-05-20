package com.fon.student_tracker.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String ime;

    @Column(nullable = false)
    private String prezime;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "godina_upisa", nullable = false)
    private int godinaUpisa;

    @Column(nullable = false)
    private int redniBroj;

    @ManyToOne(optional = false)
    @JoinColumn(name = "smer_id", nullable = false)
    private Smer smer;

    @ManyToOne(optional = false)
    @JoinColumn(name = "modul_id", nullable = false)
    private Modul modul;

}
