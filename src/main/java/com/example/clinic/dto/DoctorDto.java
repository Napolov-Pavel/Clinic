package com.example.clinic.dto;

import lombok.Data;

@Data
public class DoctorDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String email;
}
