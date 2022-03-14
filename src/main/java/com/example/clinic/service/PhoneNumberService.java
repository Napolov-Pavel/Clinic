package com.example.clinic.service;

import com.example.clinic.dto.PhoneNumberDto;

import java.util.List;

public interface PhoneNumberService {
    void createPhoneNumber(PhoneNumberDto phoneNumberDto);
    PhoneNumberDto getById(Long id);
    void delete(Long id);
    List<PhoneNumberDto> getAll();
}
