package com.example.housingprojectsbackend.persistence.repository;


import com.example.housingprojectsbackend.persistence.entity.ConstructionCompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConstructionCompanyPersistenceRepository extends JpaRepository<ConstructionCompanyEntity, Integer> {
}
