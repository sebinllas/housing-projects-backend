package com.example.housingprojectsbackend.persistence.mapper;

import com.example.housingprojectsbackend.domain.ConstructionCompany;
import com.example.housingprojectsbackend.persistence.entity.ConstructionCompanyEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ConstructionCompanyPersistenceMapper {
    ConstructionCompany toConstructionCompany(ConstructionCompanyEntity constructionCompanyEntity);
    ConstructionCompanyEntity toConstructionCompanyEntity(ConstructionCompany constructionCompany);
    List<ConstructionCompany> toConstructionCompanies(List<ConstructionCompanyEntity> constructionCompanyEntities);
    List<ConstructionCompanyEntity> toConstructionCompanyEntities(List<ConstructionCompany> constructionCompanies);
}
