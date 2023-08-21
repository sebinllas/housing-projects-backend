package com.example.housingprojectsbackend.domain.service;

import com.example.housingprojectsbackend.domain.repository.ProjectRepository;
import org.springframework.stereotype.Service;


public class ProjectService {
    private ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }
}
