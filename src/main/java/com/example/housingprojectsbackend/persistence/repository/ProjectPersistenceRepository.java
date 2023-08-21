package com.example.housingprojectsbackend.persistence.repository;

import com.example.housingprojectsbackend.persistence.entity.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectPersistenceRepository extends JpaRepository<ProjectEntity, Integer> {
}
