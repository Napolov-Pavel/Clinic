package com.example.clinic.dao;

import com.example.clinic.entity.Photo;

import java.util.List;

public interface PhotoDao {
    void create(Photo photo);
    Photo get(Long id);
    void delete(Long id);
    List<Photo> getAll();
}
