package com.example.housingprojectsbackend.persistence.mapper;

import com.example.housingprojectsbackend.domain.Project;
import com.example.housingprojectsbackend.persistence.entity.ProjectEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProjectPersistenceMapper {
    Project toProject(ProjectEntity projectEntity);
    ProjectEntity toProjectEntity(Project project);
}
