package com.example.clinic.dao;

import com.example.clinic.entity.PhoneNumber;

import java.util.List;

public interface PhoneNumberDao {
    void create(PhoneNumber phoneNumber);
    PhoneNumber get(Long id);
    PhoneNumber getPhoneNumber(String phoneNumber);
    void delete(Long id);
    List<PhoneNumber> getAll();
}
