package com.example.rentacarmanagment.dto.request;

import jakarta.validation.constraints.NotBlank;

public record RegisterRequest (
        @NotBlank(message = "name cannot be Blank") String name,
        @NotBlank(message = "surname cannot be Blank") String surname,
        @NotBlank(message = "email cannot be Blank") String email,
        @NotBlank(message = "passport number cannot be Blank") String passportNumber,
        @NotBlank(message = "location cannot be Blank") String location,
        @NotBlank(message = "nationality cannot be Blank") String nationality,
        @NotBlank(message = "age cannot be Blank") Integer age
){
}
