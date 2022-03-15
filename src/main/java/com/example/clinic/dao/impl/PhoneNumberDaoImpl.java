package com.example.clinic.dao.impl;

import com.example.clinic.dao.PhoneNumberDao;
import com.example.clinic.entity.PhoneNumber;
import com.example.clinic.repository.PhoneNumberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


import java.util.List;
@Component
@RequiredArgsConstructor
public class PhoneNumberDaoImpl implements PhoneNumberDao {
    private final PhoneNumberRepository phoneNumberRepository;

    @Override
    public void create(PhoneNumber phoneNumber) {
        phoneNumberRepository.save(phoneNumber);
    }

    @Override
    public PhoneNumber get(Long id) {
        return phoneNumberRepository.getById(id);
    }

    @Override
    public PhoneNumber getPhoneNumber(String phoneNumber) {
        return phoneNumberRepository.getPhoneNumberByPhoneNumber(phoneNumber);
    }

    @Override
    public void delete(Long id) {
        phoneNumberRepository.deleteById(id);
    }

    @Override
    public List<PhoneNumber> getAll() {
        return phoneNumberRepository.findAll();
    }
}
