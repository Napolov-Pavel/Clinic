package com.example.clinic.service;

import com.example.clinic.dto.PatientCardDto;
import java.util.List;

public interface PatientCardService {

    PatientCardDto getById(Long id);
    List<PatientCardDto> getAll();
}
