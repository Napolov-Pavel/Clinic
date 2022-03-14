package com.example.clinic.controller;

import com.example.clinic.dto.PatientCardDto;
import com.example.clinic.service.PatientCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/patient-cards")
public class PatientCardController {

    private final PatientCardService patientCardService;

    @GetMapping
    public ResponseEntity<PatientCardDto> getPatientCardById(@RequestParam Long id) {
        return ResponseEntity.ok().body(patientCardService.getById(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<PatientCardDto>> getAllPatientCards() {
        return ResponseEntity.ok().body(patientCardService.getAll());
    }
}
