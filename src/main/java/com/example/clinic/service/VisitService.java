package com.example.clinic.service;

import com.example.clinic.dto.VisitDto;

import java.util.List;

public interface VisitService {
    void createVisit(VisitDto visitDto);
    VisitDto getById(Long id);
    List<VisitDto> getAll();
}
