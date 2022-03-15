package com.example.clinic.dao.impl;

import com.example.clinic.dao.PatientCardDao;
import com.example.clinic.entity.PatientCard;
import com.example.clinic.repository.PatientCardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@RequiredArgsConstructor
public class PatientCardDaoImpl implements PatientCardDao {
    private final PatientCardRepository patientCardRepository;

    @Override
    public PatientCard get(Long id) {
        return patientCardRepository.getById(id);
    }

    @Override
    public List<PatientCard> getAll() {
        return patientCardRepository.findAll();
    }
}
