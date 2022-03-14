package com.example.clinic.repository;

import com.example.clinic.entity.PhoneNumber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneNumberRepository extends JpaRepository<PhoneNumber, Long> {
    PhoneNumber getPhoneNumberByPhoneNumber(String phoneNumber);
}
