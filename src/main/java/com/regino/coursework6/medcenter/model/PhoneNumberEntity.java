package com.regino.coursework6.medcenter.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "phone_number")
public class PhoneNumberEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;

    @Column(name = "number")
    private String number;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "med_center_id")
    private MedicalCenterEntity medCenter;
}
