package com.example.clinic.dao.impl;

import com.example.clinic.dao.PhotoDao;
import com.example.clinic.entity.Photo;
import com.example.clinic.repository.PhotoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@RequiredArgsConstructor
public class PhotoDaoImpl implements PhotoDao {
    private final PhotoRepository photoRepository;

    @Override
    public void create(Photo photo) {
        photoRepository.save(photo);
    }

    @Override
    public Photo get(Long id) {
        return photoRepository.getById(id);
    }

    @Override
    public void delete(Long id) {
        photoRepository.deleteById(id);
    }

    @Override
    public List<Photo> getAll() {
        return photoRepository.findAll();
    }
}
