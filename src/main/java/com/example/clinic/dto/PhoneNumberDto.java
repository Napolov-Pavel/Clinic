package com.example.clinic.dto;

import lombok.Data;

@Data
public class PhoneNumberDto {
    private Long id;
    private String phoneNumber;
    private Long patientId;
}
