package com.example.clinic.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@NoArgsConstructor
@Entity
@Table(name = "photos")
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "url_photo")
    private String urlPhoto;
    @ManyToOne
    @JoinColumn(name = "patients_id")
    private Patient patient;
}
