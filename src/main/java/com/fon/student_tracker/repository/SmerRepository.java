package com.fon.student_tracker.repository;


import com.fon.student_tracker.domain.Smer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmerRepository extends JpaRepository<Smer, Long> {
}
