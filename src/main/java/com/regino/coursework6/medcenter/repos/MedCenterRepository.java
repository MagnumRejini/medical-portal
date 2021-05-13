package com.regino.coursework6.medcenter.repos;

import com.regino.coursework6.medcenter.model.MedicalCenterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface MedCenterRepository extends JpaRepository<MedicalCenterEntity, Integer> {

    @Query("select distinct m from MedicalCenterEntity m inner join fetch m.doctors inner join fetch m.services inner join fetch m.phoneNumbers")
    Collection<MedicalCenterEntity> findAllFetch();
}
