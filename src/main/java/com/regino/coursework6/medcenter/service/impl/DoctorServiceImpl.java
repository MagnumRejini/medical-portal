package com.regino.coursework6.medcenter.service.impl;

import com.regino.coursework6.medcenter.dto.DoctorDto;
import com.regino.coursework6.medcenter.repos.DoctorRepository;
import com.regino.coursework6.medcenter.service.DoctorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Collection;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class DoctorServiceImpl implements DoctorService {

    private final DoctorRepository doctorRepository;

    @Override
    @Transactional
    public Collection<DoctorDto> findAll() {
        return doctorRepository.findAll()
                .stream()
                .map(DoctorDto::new)
                .collect(Collectors.toList());
    }
}
