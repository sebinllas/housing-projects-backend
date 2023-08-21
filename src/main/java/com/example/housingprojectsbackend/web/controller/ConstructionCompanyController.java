package com.example.housingprojectsbackend.web.controller;

import com.example.housingprojectsbackend.domain.ConstructionCompany;
import com.example.housingprojectsbackend.domain.service.ConstructionCompanyService;
import com.example.housingprojectsbackend.web.dto.ConstructionCompanyCreateDTO;
import com.example.housingprojectsbackend.web.dto.ConstructionCompanyUpdateDTO;
import com.example.housingprojectsbackend.web.mapper.ConstructionCompanyWebMapper;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RestController
@RequestMapping("/construction-companies")
public class ConstructionCompanyController {

    private final ConstructionCompanyService constructionCompanyService;
    private final ConstructionCompanyWebMapper constructionCompanyWebMapper;

    public ConstructionCompanyController(ConstructionCompanyService constructionCompanyService, ConstructionCompanyWebMapper constructionCompanyWebMapper) {
        this.constructionCompanyService = constructionCompanyService;
        this.constructionCompanyWebMapper = constructionCompanyWebMapper;
    }

    @GetMapping("/{id}")
    public Optional<ConstructionCompany> getById(@PathVariable int id) {
        return constructionCompanyService.get(id);
    }

    @GetMapping()
    public List<ConstructionCompany> getAll() {
        return constructionCompanyService.getAll();
    }

    @PostMapping()
    public ConstructionCompany save(@RequestBody @Valid ConstructionCompanyCreateDTO constructionCompanyCreateDTO) {
        var constructionCompany = constructionCompanyWebMapper.toConstructionCompany(constructionCompanyCreateDTO);
        return constructionCompanyService.save(constructionCompany);
    }

    @PutMapping("/{id}")
    public ConstructionCompany update(@PathVariable int id, @RequestBody @Valid ConstructionCompanyUpdateDTO constructionCompanyUpdateDTO) {
        var constructionCompany = constructionCompanyService.get(id);
        System.out.println(constructionCompanyUpdateDTO);
        if (constructionCompany.isEmpty()) {
            throw new RuntimeException("Construction company not found");
        }
        return constructionCompanyService.
                update(constructionCompanyWebMapper.
                        updateConstructionCompany(
                                constructionCompanyUpdateDTO,
                                constructionCompany.get())
                );
    }
}
