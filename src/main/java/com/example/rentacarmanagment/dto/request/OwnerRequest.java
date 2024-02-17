package com.example.rentacarmanagment.dto.request;

import jakarta.validation.constraints.NotBlank;

public record OwnerRequest(

        @NotBlank(message = "id cannot be blank") Long id,
        @NotBlank(message = "name cannot be blank") String name,
        @NotBlank(message = "surname cannot be blank") String surname,
        @NotBlank(message = "email cannot be blank") String email,
        @NotBlank(message = "passportNumber cannot be blank") String passportNumber,
        @NotBlank(message = "location cannot be blank") String location,
        @NotBlank(message = "phoneNumber cannot be blank") String phoneNumber

) {
}
