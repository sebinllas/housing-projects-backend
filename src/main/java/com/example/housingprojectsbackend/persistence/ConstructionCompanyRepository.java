package com.example.housingprojectsbackend.persistence;

import com.example.housingprojectsbackend.domain.ConstructionCompany;
import com.example.housingprojectsbackend.persistence.entity.ConstructionCompanyEntity;
import com.example.housingprojectsbackend.persistence.mapper.ConstructionCompanyPersistenceMapper;
import com.example.housingprojectsbackend.persistence.repository.ConstructionCompanyPersistenceRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ConstructionCompanyRepository implements com.example.housingprojectsbackend.domain.repository.ConstructionCompanyRepository {

    private final ConstructionCompanyPersistenceRepository constructionCompanyPersistenceRepository;
    private final ConstructionCompanyPersistenceMapper constructionCompanyMapper;

    public ConstructionCompanyRepository(
            ConstructionCompanyPersistenceRepository constructionCompanyPersistenceRepository,
            ConstructionCompanyPersistenceMapper constructionCompanyPersistenceMapper
    ) {
        this.constructionCompanyPersistenceRepository = constructionCompanyPersistenceRepository;
        this.constructionCompanyMapper = constructionCompanyPersistenceMapper;
    }

    @Override
    public List<ConstructionCompany> getAll() {
        var constructionCompanyEntities = constructionCompanyPersistenceRepository.findAll();
        return constructionCompanyMapper.toConstructionCompanies((List<ConstructionCompanyEntity>) constructionCompanyEntities);
    }

    @Override
    public Optional<ConstructionCompany> get(int constructionCompanyId) {
        return constructionCompanyPersistenceRepository
                .findById(constructionCompanyId)
                .map(constructionCompanyMapper::toConstructionCompany);
    }

    @Override
    public ConstructionCompany save(ConstructionCompany constructionCompany) {
        var constructionCompanyEntity = constructionCompanyPersistenceRepository
                .save(constructionCompanyMapper.toConstructionCompanyEntity(constructionCompany));
        return constructionCompanyMapper.toConstructionCompany(constructionCompanyEntity);
    }

    @Override
    public void delete(int constructionCompanyId) {
        constructionCompanyPersistenceRepository.deleteById(constructionCompanyId);
    }

    @Override
    public ConstructionCompany update(ConstructionCompany constructionCompany) {
        var newConstructionCompany = constructionCompanyPersistenceRepository.save(constructionCompanyMapper.toConstructionCompanyEntity(constructionCompany));
        return constructionCompanyMapper.toConstructionCompany(newConstructionCompany);
    }
}
