package com.example.clinic.dao;

import com.example.clinic.entity.PatientCard;

import java.util.List;

public interface PatientCardDao {
    PatientCard get(Long id);
    List<PatientCard> getAll();
}
