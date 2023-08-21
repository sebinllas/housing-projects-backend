package com.example.housingprojectsbackend.domain;

import lombok.Data;

import java.util.List;

@Data
public class Project {
    private int id;
    private String name;
    private double price;
    private String City;
    private ProjectStatus status;
    private ProjectType type;
    private String description;
    private Double latitude;
    private Double longitude;
    private ConstructionCompany constructionCompany;
    private List<ProjectImage> images;
    private List<InterestingPlace> interestingPlaces;
    private List<String> tags;
    private String salesOfficeAddress;
    private String Phone;
    private String Email;
    private String Website;
    private String youtubeVideoUrl;
}