package com.example.housingprojectsbackend.persistence.entity;

import com.example.housingprojectsbackend.domain.ProjectStatus;
import com.example.housingprojectsbackend.domain.ProjectType;
import jakarta.persistence.*;

import java.util.List;

@Entity(name = "project")
public class ProjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private double price;
    private String City;
    private ProjectStatus status;
    private ProjectType type;
    private String description;
    private Double latitude;
    private Double longitude;
    @ManyToOne(targetEntity = ConstructionCompanyEntity.class)
    private ConstructionCompanyEntity constructionCompany;
    @OneToMany(targetEntity = ProjectImageEntity.class, cascade = CascadeType.ALL, mappedBy = "project")
    private List<ProjectImageEntity> images;
    /*    @OneToMany(mappedBy = "project_interesting_place",cascade = CascadeType.ALL)
        private List<InterestingPlace> interestingPlaces;*/
    @ElementCollection
    private List<String> tags;
    private String salesOfficeAddress;
    private String Phone;
    private String Email;
    private String Website;
    private String youtubeVideoUrl;
}
