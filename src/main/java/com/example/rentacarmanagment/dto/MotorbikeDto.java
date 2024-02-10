package com.example.rentacarmanagment.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MotorbikeDto {
    private Float enginePower;
    private String carMark;
    private String carModel;
    private String carDate;
    private String color;
    private Boolean availability;
    private String bikeType;
    private Long ownerId;
}
