package com.example.clinic.repository;

import com.example.clinic.entity.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRepository extends JpaRepository<Photo, Long> {
}
