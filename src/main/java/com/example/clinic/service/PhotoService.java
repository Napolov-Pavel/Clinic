package com.example.clinic.service;

import com.example.clinic.dto.PhotoDto;

import java.util.List;

public interface PhotoService {
    void createPhoto(PhotoDto photoDto);
    PhotoDto geBytId(Long id);
    void delete(Long id);
    List<PhotoDto> getAll();
}
