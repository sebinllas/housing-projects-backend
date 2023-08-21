package com.example.housingprojectsbackend.persistence.entity;

import com.example.housingprojectsbackend.domain.Project;
import com.example.housingprojectsbackend.domain.ProjectImageType;
import jakarta.persistence.*;

@Entity(name = "project_image")
public class ProjectImageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String url;

    @ManyToOne(targetEntity = ProjectEntity.class)
    private Project project;
    private String description;
    private ProjectImageType type;
}
