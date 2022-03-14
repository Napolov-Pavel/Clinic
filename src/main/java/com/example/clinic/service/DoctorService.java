package com.example.clinic.service;

import com.example.clinic.dto.DoctorDto;

import java.util.List;

public interface DoctorService {
    void createDoctor(DoctorDto doctorDto);
    DoctorDto getDoctorById(Long id);
    void delete(Long id);
    List<DoctorDto> getAll();
}
