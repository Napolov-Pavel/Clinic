package com.example.clinic.service.impl;

import com.example.clinic.dao.PhoneNumberDao;
import com.example.clinic.dto.PhoneNumberDto;
import com.example.clinic.entity.PhoneNumber;
import com.example.clinic.repository.PatientRepository;
import com.example.clinic.service.PhoneNumberService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PhoneNumberImpl implements PhoneNumberService {

    private final PatientRepository patientRepository;
    private final ModelMapper modelMapper;
    private final PhoneNumberDao phoneNumberDao;

    @Override
    public void createPhoneNumber(PhoneNumberDto phoneNumberDto) {
        PhoneNumber phoneNumber = modelMapper.map(phoneNumberDto, PhoneNumber.class);
        phoneNumber.setPatient(patientRepository.getById(phoneNumberDto.getPatientId()));
        phoneNumberDao.create(phoneNumber);
    }

    @Override
    public PhoneNumberDto getById(Long id) {
        PhoneNumber phoneNumber = phoneNumberDao.get(id);
        return modelMapper.map(phoneNumber, PhoneNumberDto.class);
    }

    @Override
    public void delete(Long id) {
        phoneNumberDao.delete(id);
    }

    @Override
    public List<PhoneNumberDto> getAll() {
        return phoneNumberDao.getAll().stream()
                .map(phoneNumber -> modelMapper.map(phoneNumber, PhoneNumberDto.class))
                .distinct()
                .collect(Collectors.toList());
    }
}
