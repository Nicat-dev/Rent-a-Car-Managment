package com.example.rentacarmanagment.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TruckDto {
    private Long id;
    private Float enginePower;
    private String carMark;
    private String carModel;
    private String carDate;
    private String color;
    private Boolean availability;
    private Integer loadCapacity;
    private Boolean isFourWheelDrive;
    private String cargoType;
    private Long ownerId;

}
