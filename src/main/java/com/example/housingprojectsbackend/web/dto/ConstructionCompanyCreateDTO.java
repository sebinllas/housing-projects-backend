package com.example.housingprojectsbackend.web.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

@Data
public class ConstructionCompanyCreateDTO {
    @NotEmpty(message = "Name should not be empty")
    private String name;
    @NotEmpty
    @Email(message = "Email should be valid")
    private String email;
    @NotEmpty(message = "Website should not be empty")
    @URL(message = "Website should be a valid URL")
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