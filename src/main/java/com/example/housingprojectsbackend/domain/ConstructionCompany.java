package com.example.housingprojectsbackend.domain;

import lombok.Data;

@Data
public class ConstructionCompany {
    private int id;
    private String name;
    private String email;
    private String website;
    private String phone;
    private String city;
    private String address;
    private String logo;
}
