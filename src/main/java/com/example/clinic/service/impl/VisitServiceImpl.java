package com.example.clinic.service.impl;

import com.example.clinic.dao.DoctorDao;
import com.example.clinic.dao.PatientDao;
import com.example.clinic.dao.VisitDao;
import com.example.clinic.dto.VisitDto;
import com.example.clinic.entity.Visit;
import com.example.clinic.service.VisitService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class VisitServiceImpl implements VisitService {

    private final ModelMapper modelMapper;
    private final VisitDao visitDao;
    private final PatientDao patientDao;
    private final DoctorDao doctorDao;

    @Override
    public void createVisit(VisitDto visitDto) {
        visitDao.create(Visit.builder()
                .patient(patientDao.get(visitDto.getPatient().getId()))
                .doctor(doctorDao.get(visitDto.getDoctor().getId()))
                .build());
    }

    @Override
    public VisitDto getById(Long id) {
        Visit visit = visitDao.get(id);
        return modelMapper.map(visit, VisitDto.class);
    }

    @Override
    public List<VisitDto> getAll() {
        return visitDao.getAll().stream()
                .map(visit -> modelMapper.map(visit, VisitDto.class))
                .distinct()
                .collect(Collectors.toList());
    }

}
