package com.example.clinic.service;

import com.example.clinic.dto.PatientFindDto;
import com.example.clinic.dto.PatientDto;

import java.util.List;

public interface PatientService {
    void createPatient(PatientDto patientDto);
    PatientDto getById(Long id);
    PatientDto getPatientByParameters(PatientFindDto findBy);
    void delete(Long id);
    List<PatientDto> getAll();
}
