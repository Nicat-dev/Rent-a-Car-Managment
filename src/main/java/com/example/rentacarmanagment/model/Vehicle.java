package com.example.rentacarmanagment.model;


import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class Vehicle {
    @Column(name = "engine_power",nullable = false)
    private Float enginePower;
    @Column(name = "car_mark",nullable = false)
    private String carMark;
    @Column(name = "car_model",nullable = false)
    private String carModel;
    @Column(name = "car_date",nullable = false)
    private String carDate;
    @Column(name = "color",nullable = false)
    private String color;
    @Column(name = "availability",nullable = false)
    private Boolean availability;
}
