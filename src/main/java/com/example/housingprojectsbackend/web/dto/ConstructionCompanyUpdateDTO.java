package com.example.housingprojectsbackend.web.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;

public class ConstructionCompanyUpdateDTO {
    @NotEmpty(message = "Name should not be empty")
    private String name;
    @Email(message = "Email should be valid")
    @NotEmpty(message = "Email should not be empty")
    private String email;
    @URL(message = "Website should be a valid URL")
    @NotEmpty(message = "Website should not be empty")
    private String website;
    @NotEmpty(message = "Phone should not be empty")
    private String phone;
    @NotEmpty(message = "City should not be empty")
    private String city;
    @NotEmpty(message = "Address should not be empty")
    private String address;
    @URL(message = "Logo should be a valid URL")
    private String logo;
}
