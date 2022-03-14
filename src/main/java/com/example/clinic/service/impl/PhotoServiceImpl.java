package com.example.clinic.service.impl;

import com.example.clinic.dao.PhotoDao;
import com.example.clinic.dto.PhotoDto;
import com.example.clinic.entity.Photo;
import com.example.clinic.repository.PatientRepository;
import com.example.clinic.service.PhotoService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PhotoServiceImpl implements PhotoService {

    private final PatientRepository patientRepository;
    private final ModelMapper modelMapper;
    private final PhotoDao photoDao;

    @Override
    public void createPhoto(PhotoDto photoDto) {
        Photo photo = modelMapper.map(photoDto, Photo.class);
        photo.setPatient(patientRepository.getById(photoDto.getPatientId()));
        photoDao.create(photo);
    }

    @Override
    public PhotoDto geBytId(Long id) {
        Photo photo = photoDao.get(id);
        return modelMapper.map(photo, PhotoDto.class);
    }

    @Override
    public void delete(Long id) {
        photoDao.delete(id);
    }

    @Override
    public List<PhotoDto> getAll() {
        return photoDao.getAll().stream()
                .map(photo -> modelMapper.map(photo, PhotoDto.class))
                .distinct()
                .collect(Collectors.toList());
    }

}
