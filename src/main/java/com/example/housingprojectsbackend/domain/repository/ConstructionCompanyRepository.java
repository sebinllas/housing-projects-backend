package com.example.housingprojectsbackend.domain.repository;

import com.example.housingprojectsbackend.domain.ConstructionCompany;

import java.util.List;
import java.util.Optional;

public interface ConstructionCompanyRepository {
    List<ConstructionCompany> getAll();
    Optional<ConstructionCompany> get(int constructionCompanyId);
    ConstructionCompany save(ConstructionCompany constructionCompany);
    void delete(int constructionCompanyId);
    ConstructionCompany update(ConstructionCompany constructionCompany);
}
