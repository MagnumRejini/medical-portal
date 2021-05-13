package com.regino.coursework6.medcenter.service.impl;

import com.regino.coursework6.medcenter.dto.MedicalCenterDto;
import com.regino.coursework6.medcenter.model.MedicalCenterEntity;
import com.regino.coursework6.medcenter.repos.MedCenterRepository;
import com.regino.coursework6.medcenter.service.MedCenterService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MedCenterServiceImpl implements MedCenterService {
    private final MedCenterRepository medCenterRepository;

    @Override
    public Collection<MedicalCenterDto> findAllFetch() {
        return medCenterRepository.findAllFetch()
                .stream()
                .map(MedicalCenterDto::new)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<MedicalCenterDto> findMedCenterById(int id) {
        return medCenterRepository.findById(id)
                .map(MedicalCenterDto::new);
    }
}
