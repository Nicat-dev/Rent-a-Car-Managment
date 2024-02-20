package com.example.rentacarmanagment.dto.request;

import jakarta.validation.constraints.NotBlank;

public record TruckRequest(

        Long id,
        @NotBlank(message = "engine cannot be Blank") Float enginePower,
        @NotBlank(message = "car mark cannot be Blank") String carMark,
        @NotBlank(message = "car model cannot be Blank") String carModel,
        @NotBlank(message = "car date cannot be Blank") String carDate,
        @NotBlank(message = "color cannot be Blank") String color,
        @NotBlank(message = "availability cannot be Blank") Boolean availability,
        Integer loadCapacity,
        Boolean isFourWheelDrive,
        String cargoType,
        Long ownerId


) {
}
