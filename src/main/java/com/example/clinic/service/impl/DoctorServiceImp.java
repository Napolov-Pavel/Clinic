package com.example.clinic.service.impl;

import com.example.clinic.dao.DoctorDao;
import com.example.clinic.dto.DoctorDto;
import com.example.clinic.entity.Doctor;
import com.example.clinic.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DoctorServiceImp implements DoctorService {

    private final ModelMapper modelMapper;
    private final DoctorDao doctorDao;


    @Override
    public void createDoctor(DoctorDto doctorDto) {
        doctorDao.create(modelMapper.map(doctorDto, Doctor.class));
    }

    @Override
    public DoctorDto getDoctorById(Long id) {
        Doctor doctor = doctorDao.get(id);
        return modelMapper.map(doctor, DoctorDto.class);
    }

    @Override
    public void delete(Long id) {
        doctorDao.delete(id);
    }

    @Override
    public List<DoctorDto> getAll() {
        return doctorDao.getAll().stream()
                .map(doctor -> modelMapper.map(doctor, DoctorDto.class))
                .distinct()
                .collect(Collectors.toList());
    }
}
