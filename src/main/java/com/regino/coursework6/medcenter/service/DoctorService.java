package com.regino.coursework6.medcenter.service;

import com.regino.coursework6.medcenter.dto.DoctorDto;

import java.util.Collection;

public interface DoctorService {
    Collection<DoctorDto> findAll();
}
