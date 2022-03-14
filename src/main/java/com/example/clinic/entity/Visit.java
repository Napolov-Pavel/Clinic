package com.example.clinic.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "visits")
public class Visit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @CreationTimestamp
    @Column(name = "date_visit")
    private Timestamp dateVisit;
    @OneToOne
    @JoinColumn(name = "doctors_id")
    private Doctor doctor;
    @ManyToOne
    @JoinColumn(name = "patients_id")
    private Patient patient;
}
