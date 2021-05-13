package com.regino.coursework6.medcenter.controller;

import com.regino.coursework6.medcenter.dto.DoctorDto;
import com.regino.coursework6.medcenter.repos.DoctorRepository;
import com.regino.coursework6.medcenter.service.DoctorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/doctors")
@AllArgsConstructor
public class DoctorController {
    private final DoctorService doctorService;

    @GetMapping
    public Collection<DoctorDto> getAllDoctors() {
        return doctorService.findAll();
    }
}
