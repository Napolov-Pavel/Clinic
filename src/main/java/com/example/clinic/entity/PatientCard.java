package com.example.clinic.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@Entity
@Table(name = "patient_cards")
public class PatientCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "number_card")
    private String numberCard;
    @CreationTimestamp
    @Column(name = "create_date")
    private LocalDateTime createDate;
    @UpdateTimestamp
    @Column(name = "update_date")
    private LocalDateTime updateDate;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Patient patient;
}
