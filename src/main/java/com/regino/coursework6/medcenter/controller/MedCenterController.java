package com.regino.coursework6.medcenter.controller;

import com.regino.coursework6.medcenter.dto.MedicalCenterDto;
import com.regino.coursework6.medcenter.service.MedCenterService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collection;

import static org.springframework.http.HttpStatus.*;

@AllArgsConstructor
@Slf4j
@RestController
@RequestMapping("/med_centers")
public class MedCenterController {

    private final MedCenterService medCenterService;

    @GetMapping
    public Collection<MedicalCenterDto> getAllMedCenters() {
        log.info("get all med centers");
        return medCenterService.findAllFetch();
    }

    @GetMapping("/{id}")
    public MedicalCenterDto getMedCenterById(@PathVariable int id) {
        log.info("get med center with id {}", id);
        return medCenterService.findMedCenterById(id)
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "MedCenter not found"));
    }


}
