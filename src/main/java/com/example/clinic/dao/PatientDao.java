package com.example.clinic.dao;

import com.example.clinic.dto.PatientFindDto;
import com.example.clinic.entity.Patient;

import java.util.List;

public interface PatientDao {
    void create(Patient patient);
    Patient get(Long id);
    Patient getPatientByParameters(PatientFindDto findBy);
    void delete(Long id);
    List<Patient> getAll();
}
