package com.regino.coursework6.medcenter.dto;

import com.regino.coursework6.medcenter.model.MedicalCenterEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@NoArgsConstructor
@Data
public class MedicalCenterDto {
    private String name;
    private String fullname;
    private String address;
    private String description;
    private String buildingImg;
    private String logo;
    private String iframe;
    private String coord;
    private String schedule;
    private Set<DoctorDto> doctors;
    private Set<PhoneNumberDto> phoneNumbers;
    private Set<ServiceDto> services;

    public MedicalCenterDto(MedicalCenterEntity medCenter) {
        this.name = medCenter.getName();
        this.fullname = medCenter.getFullname();
        this.address = medCenter.getAddress();
        this.description = medCenter.getDescription();
        this.buildingImg = medCenter.getBuildingImg();
        this.logo = medCenter.getLogoImg();
        this.iframe = medCenter.getIframe();
        this.coord = medCenter.getCoord();
        this.schedule = medCenter.getSchedule();

        this.doctors = medCenter.getDoctors().stream()
                .map(DoctorDto::new)
                .collect(Collectors.toSet());
        this.phoneNumbers = medCenter.getPhoneNumbers().stream()
                .map(PhoneNumberDto::new)
                .collect(Collectors.toSet());
        this.services = medCenter.getServices().stream()
                .map(ServiceDto::new)
                .collect(Collectors.toSet());
    }
}
