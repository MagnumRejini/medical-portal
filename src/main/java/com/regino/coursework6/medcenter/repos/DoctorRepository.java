package com.regino.coursework6.medcenter.repos;

import com.regino.coursework6.medcenter.model.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<DoctorEntity, Integer> {
}
