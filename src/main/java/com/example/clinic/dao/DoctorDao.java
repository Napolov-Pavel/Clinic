package com.example.clinic.dao;
import com.example.clinic.entity.Doctor;

import java.util.List;

public interface DoctorDao {

    void create(Doctor doctor);
    Doctor get(Long id);
    void delete(Long id);
    List<Doctor> getAll();
}
