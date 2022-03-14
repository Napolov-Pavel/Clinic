package com.example.clinic.service.impl;

import com.example.clinic.dao.PatientCardDao;
import com.example.clinic.dto.PatientCardDto;
import com.example.clinic.entity.PatientCard;
import com.example.clinic.service.PatientCardService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PatientCardServiceImpl implements PatientCardService {

    private final ModelMapper modelMapper;
    private final PatientCardDao patientCardDao;

    @Override
    public PatientCardDto getById(Long id) {
        PatientCard patientCard = patientCardDao.get(id);
        return modelMapper.map(patientCard, PatientCardDto.class);
    }

    @Override
    public List<PatientCardDto> getAll() {
        return patientCardDao.getAll().stream()
                .map(patientCard -> modelMapper.map(patientCard, PatientCardDto.class))
                .distinct()
                .collect(Collectors.toList());
    }
}
