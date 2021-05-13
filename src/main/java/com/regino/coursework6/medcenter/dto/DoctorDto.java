package com.regino.coursework6.medcenter.dto;

import com.regino.coursework6.medcenter.model.DoctorEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class DoctorDto {
    private String name;
    private String speciality;
    private String category;
    private String workExperience;
    private String graduation;
    private String img;
    private String phone;
    private String email;
    private String medCenterName;

    public DoctorDto(DoctorEntity doctor) {
        this.name = doctor.getName();
        this.speciality = doctor.getSpeciality();
        this.category = doctor.getCategory();
        this.workExperience = doctor.getWorkExperience();
        this.graduation = doctor.getGraduation();
        this.img = doctor.getImg();
        this.phone = doctor.getPhone();
        this.email = doctor.getEmail();
        this.medCenterName = doctor.getMedCenter().getName();
    }
}
