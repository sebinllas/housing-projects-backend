package com.example.housingprojectsbackend.domain.repository;

import com.example.housingprojectsbackend.domain.Project;
import java.util.List;
import java.util.Optional;

public interface ProjectRepository {
    List<Project> getAll();
    Optional<Project> get(int projectId);
    Project save(Project project);
    void delete(int projectId);
    Project update(int projectId, Project project);
    Optional<List<Project>> getProjectsByConstructionCompanyId(int constructionCompanyId);
    Optional<List<Project>> getByCity(String city);
}
