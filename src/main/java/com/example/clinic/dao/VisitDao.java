package com.example.clinic.dao;

import com.example.clinic.entity.Visit;

import java.util.List;

public interface VisitDao {
    void create(Visit visit);
    Visit get(Long id);
    List<Visit> getAll();
}
