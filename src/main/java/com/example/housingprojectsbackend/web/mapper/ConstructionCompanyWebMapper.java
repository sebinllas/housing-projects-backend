package com.example.housingprojectsbackend.web.mapper;

import com.example.housingprojectsbackend.domain.ConstructionCompany;
import com.example.housingprojectsbackend.web.dto.ConstructionCompanyCreateDTO;
import com.example.housingprojectsbackend.web.dto.ConstructionCompanyUpdateDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ConstructionCompanyWebMapper {
    ConstructionCompany toConstructionCompany(ConstructionCompanyCreateDTO constructionCompanyCreateDTO);
    ConstructionCompany updateConstructionCompany(
            ConstructionCompanyUpdateDTO dto,
            @MappingTarget ConstructionCompany constructionCompany);
}
