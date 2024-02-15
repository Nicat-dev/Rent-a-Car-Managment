package com.example.rentacarmanagment.dto.request;

import jakarta.validation.constraints.NotBlank;

public record CarRequest(

        @NotBlank(message = "engine cannot be Blank") Float enginePower,
        @NotBlank(message = "carMark cannot be Blank")String carMark,
        @NotBlank(message = "carModel cannot be Blank")String carModel,
        @NotBlank(message = "carDate cannot be Blank")String carDate,
        @NotBlank(message = "color cannot be Blank")String color,
        @NotBlank(message = "availability cannot be Blank")Boolean availability,
        @NotBlank(message = "doors cannot be Blank")Integer doors,
        @NotBlank(message = "number of seats cannot be Blank")Integer numberOfPlace,
        @NotBlank(message = "owner cannot be Blank") Long ownerId

) {
}
