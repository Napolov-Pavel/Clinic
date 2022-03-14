package com.example.clinic.dto;

import lombok.Data;

import java.util.Date;

@Data
public class VisitDto {
    private Date dateVisit;
    private PatientDto patient;
    private DoctorDto doctor;
}
