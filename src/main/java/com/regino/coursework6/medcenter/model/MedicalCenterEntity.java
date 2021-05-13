package com.regino.coursework6.medcenter.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "medical_center")
public class MedicalCenterEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "address")
    private String address;

    @Column(name = "description")
    private String description;

    @Column(name = "building_img")
    private String buildingImg;

    @Column(name = "logo_img")
    private String logoImg;

    @Column(name = "iframe")
    private String iframe;

    @Column(name = "coord")
    private String coord;

    @Column(name = "schedule")
    private String schedule;

    @OneToMany(cascade = ALL, mappedBy = "medCenter")
    private Set<DoctorEntity> doctors;

    @OneToMany(cascade = ALL, mappedBy = "medCenter")
    private Set<PhoneNumberEntity> phoneNumbers;

    @ManyToMany
    @JoinTable(
            name = "service_medcenter",
            joinColumns = @JoinColumn(name = "medcenter_id"),
            inverseJoinColumns = @JoinColumn(name = "service_id")
    )
    private Set<ServiceEntity> services;
}
