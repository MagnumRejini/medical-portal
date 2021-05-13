package com.regino.coursework6.medcenter.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "doctor")
public class DoctorEntity {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "speciality")
    private String speciality;

    @Column(name = "category")
    private String category;

    @Column(name = "work_experience")
    private String workExperience;

    @Column(name = "graduation")
    private String graduation;

    @Column(name = "img")
    private String img;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "med_center_id")
    private MedicalCenterEntity medCenter;
}
