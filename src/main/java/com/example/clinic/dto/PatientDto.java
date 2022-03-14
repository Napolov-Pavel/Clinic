package com.example.clinic.dto;

import lombok.Data;

import java.util.List;
@Data
public class PatientDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String dateOfBirth;
    private PatientCardDto patientCard;
    private List<PhoneNumberDto> phoneList;
    private List<PhotoDto> photoList;
}
