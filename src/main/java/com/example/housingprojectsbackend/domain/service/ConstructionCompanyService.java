package com.example.housingprojectsbackend.domain.service;

import com.example.housingprojectsbackend.domain.ConstructionCompany;
import com.example.housingprojectsbackend.domain.repository.ConstructionCompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConstructionCompanyService {
    private final ConstructionCompanyRepository constructionCompanyRepository;

    public ConstructionCompanyService(ConstructionCompanyRepository constructionCompanyRepository) {
        this.constructionCompanyRepository = constructionCompanyRepository;
    }

    public Optional<ConstructionCompany> get(int constructionCompanyId) {
        return constructionCompanyRepository.get(constructionCompanyId);
    }

    public List<ConstructionCompany> getAll() {
        return constructionCompanyRepository.getAll();
    }

    public ConstructionCompany save(ConstructionCompany constructionCompany) {
        return constructionCompanyRepository.save(constructionCompany);
    }

    public ConstructionCompany update(ConstructionCompany constructionCompany) {
        return constructionCompanyRepository.update(constructionCompany);
    }

    public void delete(int constructionCompanyId) {
        constructionCompanyRepository.delete(constructionCompanyId);
    }
}
