package com.example.clinic.dto;

import lombok.Data;

@Data
public class PatientFindDto {
    private String firstName;
    private String lastName;
    private String patronymic;
    private String phoneNumber;
}
