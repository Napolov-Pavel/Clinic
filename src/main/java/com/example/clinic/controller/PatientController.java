package com.example.clinic.controller;

import com.example.clinic.dto.PatientFindDto;
import com.example.clinic.dto.PatientDto;
import com.example.clinic.dto.PhoneNumberDto;
import com.example.clinic.dto.PhotoDto;
import com.example.clinic.service.PhoneNumberService;
import com.example.clinic.service.PatientService;
import com.example.clinic.service.PhotoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/patient")
public class PatientController {

    private final PatientService patientService;
    private final PhotoService photoService;
    private final PhoneNumberService phoneNumberService;

    @PostMapping("/new")
    public ResponseEntity createPatient(@RequestBody PatientDto patientDto) {
        patientService.createPatient(patientDto);
        return ResponseEntity.ok("Patient saved successfully");
    }

    @GetMapping
    public ResponseEntity<PatientDto> getPatientById(@RequestParam Long id) {
        return ResponseEntity.ok().body(patientService.getById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletePatient(@PathVariable Long id) {
        patientService.delete(id);
        return ResponseEntity.ok("Patient deleted successfully");
    }

    @GetMapping("/all")
    public ResponseEntity<List<PatientDto>> getAllPatients() {
        return ResponseEntity.ok().body(patientService.getAll());
    }

    @PostMapping("/add-photo")
    public ResponseEntity addPatientPhoto(@RequestBody PhotoDto photoDto) {
        photoService.createPhoto(photoDto);
        return ResponseEntity.ok("Photo saved successfully");
    }

    @PostMapping("/add-phone-number")
    public ResponseEntity addPhoneNumber(@RequestBody PhoneNumberDto phoneNumberDto) {
        phoneNumberService.createPhoneNumber(phoneNumberDto);
        return ResponseEntity.ok("Phone number saved successfully");
    }

    @GetMapping("/find")
    public ResponseEntity<PatientDto> getByPatronymic(@RequestBody PatientFindDto findBY) {
        return ResponseEntity.ok().body(patientService.getPatientByParameters(findBY));
    }

}
