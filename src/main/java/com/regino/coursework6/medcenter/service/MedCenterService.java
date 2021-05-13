package com.regino.coursework6.medcenter.service;

import com.regino.coursework6.medcenter.dto.MedicalCenterDto;
import com.regino.coursework6.medcenter.model.MedicalCenterEntity;

import java.util.Collection;
import java.util.Optional;

public interface MedCenterService {

    Collection<MedicalCenterDto> findAllFetch();

    Optional<MedicalCenterDto> findMedCenterById(int id);
}
