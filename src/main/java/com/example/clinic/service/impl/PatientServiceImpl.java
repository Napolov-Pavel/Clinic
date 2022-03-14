package com.example.clinic.service.impl;

import com.example.clinic.dao.PatientDao;
import com.example.clinic.dao.PhoneNumberDao;
import com.example.clinic.dto.PatientFindDto;
import com.example.clinic.dto.PatientDto;
import com.example.clinic.entity.Patient;
import com.example.clinic.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {

    private final ModelMapper modelMapper;
    private final PatientDao patientDao;
    private final PhoneNumberDao phoneNumberDao;

    @Override
    public void createPatient(PatientDto patientDto) {
        Patient patient = modelMapper.map(patientDto, Patient.class);
        patient.getPatientCard().setPatient(patient);
        patient.getPhoneList().forEach(phoneNumber -> phoneNumber.setPatient(patient));
        patientDao.create(patient);
    }

    @Override
    public PatientDto getById(Long id) {
        Patient patient = patientDao.get(id);
        return modelMapper.map(patient, PatientDto.class);
    }

    @Override
    public PatientDto getPatientByParameters(PatientFindDto findBy) {
        if (!findBy.getPhoneNumber().isEmpty()) {
            Patient patient = phoneNumberDao.getPhoneNumber(findBy.getPhoneNumber()).getPatient();
            return modelMapper.map(patient, PatientDto.class);
        } else {
            Patient patient = patientDao.getPatientByParameters(findBy);
            return modelMapper.map(patient, PatientDto.class);
        }
    }

    @Override
    public void delete(Long id) {
        patientDao.delete(id);
    }

    @Override
    public List<PatientDto> getAll() {
        return patientDao.getAll().stream()
                .map(patient -> modelMapper.map(patient, PatientDto.class))
                .distinct()
                .collect(Collectors.toList());
    }
}
