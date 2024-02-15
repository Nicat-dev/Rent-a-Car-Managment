package com.example.rentacarmanagment.dto.request;

import jakarta.validation.constraints.NotBlank;

public record MotorbikeRequest(

        @NotBlank(message = "engine cannot be Blank") Float enginePower,
        @NotBlank(message = "car mark cannot be Blank") String carMark,
        @NotBlank(message = "car model cannot be Blank") String carModel,
        @NotBlank(message = "car date cannot be Blank") String carDate,
        @NotBlank(message = "color cannot be Blank") String color,
        @NotBlank(message = "availability cannot be Blank") Boolean availability,
        @NotBlank(message = "bike type cannot be Blank") String bikeType,
        @NotBlank(message = "owner cannot be Blank") Long ownerId

) {
}
