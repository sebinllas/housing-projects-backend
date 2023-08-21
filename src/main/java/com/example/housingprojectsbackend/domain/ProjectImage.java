package com.example.housingprojectsbackend.domain;

import lombok.Data;

@Data
public class ProjectImage {
    private int id;
    private String url;
    private Project project;
    private String description;
    private ProjectImageType type;
}

