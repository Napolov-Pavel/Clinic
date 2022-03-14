package com.example.clinic.dao.impl;

import com.example.clinic.dao.DoctorDao;
import com.example.clinic.entity.Doctor;
import com.example.clinic.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class DoctorDaoImpl implements DoctorDao {

    private final DoctorRepository doctorRepository;

    @Override
    public void create(Doctor doctor) {
        doctorRepository.save(doctor);
    }

    @Override
    public Doctor get(Long id) {
        return doctorRepository.getById(id);
    }

    @Override
    public void delete(Long id) {
        doctorRepository.deleteById(id);
    }

    @Override
    public List<Doctor> getAll() {
        return doctorRepository.findAll();
    }
}
