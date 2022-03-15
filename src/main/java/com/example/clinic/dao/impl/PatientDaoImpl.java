package com.example.clinic.dao.impl;

import com.example.clinic.dao.PatientDao;
import com.example.clinic.dto.PatientFindDto;
import com.example.clinic.entity.Patient;
import com.example.clinic.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@RequiredArgsConstructor
public class PatientDaoImpl implements PatientDao {
    private final PatientRepository patientRepository;

    @Override
    public void create(Patient patient) {
        patientRepository.save(patient);
    }

    @Override
    public Patient get(Long id) {
        return patientRepository.getById(id);
    }

    @Override
    public Patient getPatientByParameters(PatientFindDto findBy) {
        return patientRepository.getPatientByFirstNameOrLastNameOrPatronymic(
                findBy.getFirstName(),
                findBy.getLastName(),
                findBy.getPatronymic());
    }

    @Override
    public void delete(Long id) {
        patientRepository.deleteById(id);
    }

    @Override
    public List<Patient> getAll() {
        return patientRepository.findAll();
    }
}
