package com.example.clinic.controller;

import com.example.clinic.dto.DoctorDto;
import com.example.clinic.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/doctor")
public class DoctorController {

    private final DoctorService doctorService;

    @PostMapping("/new")
    public ResponseEntity createDoctor(@RequestBody DoctorDto doctorDto) {
        doctorService.createDoctor(doctorDto);
        return ResponseEntity.ok("Doctor saved successfully");
    }

    @GetMapping
    public ResponseEntity<DoctorDto> getDoctorById(@RequestParam Long id) {
        return ResponseEntity.ok().body(doctorService.getDoctorById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteId(@PathVariable Long id) {
        doctorService.delete(id);
        return ResponseEntity.ok("Doctor deleted successfully");
    }

    @GetMapping("/all")
    public ResponseEntity<List<DoctorDto>> getAllDoctors() {
        return ResponseEntity.ok().body(doctorService.getAll());
    }
}
