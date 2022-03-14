package com.example.clinic.repository;

import com.example.clinic.entity.PatientCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientCardRepository extends JpaRepository<PatientCard, Long> {
}
