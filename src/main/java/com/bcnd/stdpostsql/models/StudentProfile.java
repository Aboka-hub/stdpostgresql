package com.bcnd.stdpostsql.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Table(name = "student_profile")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentProfile  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentProfileId;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "birthDate")
    private LocalDate birthDate;

    @OneToOne
    @JoinColumn(name = "student_id", unique = true)
    private Student student;
}
