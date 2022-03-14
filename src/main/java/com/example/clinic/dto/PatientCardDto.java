package com.example.clinic.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PatientCardDto {
    private Long id;
    private String numberCard;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
