package com.fon.student_tracker.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "modul")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Modul {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String naziv;
    @ManyToOne(optional = false)
    @JoinColumn(name = "smer_id", nullable = false)
    private Smer smer;
}
