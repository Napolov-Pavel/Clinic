package com.example.clinic.controller;

import com.example.clinic.dto.VisitDto;
import com.example.clinic.service.VisitService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/visit")
public class VisitController {

    private final VisitService visitService;

    @PostMapping("/new")
    public ResponseEntity createVisit(@RequestBody VisitDto visitDto) {
        visitService.createVisit(visitDto);
        return ResponseEntity.ok("Visit saved successfully");
    }

    @GetMapping
    public ResponseEntity<VisitDto> getVisitById(@RequestParam Long visitId) {
        return ResponseEntity.ok(visitService.getById(visitId));
    }

    @GetMapping("/all")
    public ResponseEntity<List<VisitDto>> getAllVisits() {
        return ResponseEntity.ok().body(visitService.getAll());
    }

}
