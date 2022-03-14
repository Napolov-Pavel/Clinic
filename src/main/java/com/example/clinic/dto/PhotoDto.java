package com.example.clinic.dto;

import lombok.Data;

@Data
public class PhotoDto {
    private Long id;
    private String urlPhoto;
    private Long patientId;
}
