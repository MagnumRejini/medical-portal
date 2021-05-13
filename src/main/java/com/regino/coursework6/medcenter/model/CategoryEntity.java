package com.regino.coursework6.medcenter.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "category")
public class CategoryEntity {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "title")
    private String title;
    @Column(name = "logo")
    private String logo;
    @Column(name = "speciality")
    private String speciality;
}
