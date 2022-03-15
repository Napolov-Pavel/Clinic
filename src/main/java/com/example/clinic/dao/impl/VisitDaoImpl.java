package com.example.clinic.dao.impl;

import com.example.clinic.dao.VisitDao;
import com.example.clinic.entity.Visit;
import com.example.clinic.repository.VisitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@RequiredArgsConstructor
public class VisitDaoImpl implements VisitDao {
    private final VisitRepository visitRepository;

    @Override
    public void create(Visit visit) {
        visitRepository.save(visit);
    }

    @Override
    public Visit get(Long id) {
        return visitRepository.getById(id);
    }

    @Override
    public List<Visit> getAll() {
        return visitRepository.findAll();
    }
}
