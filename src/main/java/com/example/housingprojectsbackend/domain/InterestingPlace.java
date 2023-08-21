package com.example.housingprojectsbackend.domain;

import lombok.Data;

@Data
public class InterestingPlace {
    private int id;
    private String name;
    private double latitude;
    private double longitude;
}
