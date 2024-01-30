package com.example.rentacarmanagment.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table
public class Truck extends Vehicle{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "load_capacity",nullable = false)
    private Integer loadCapacity;
    @Column(name = "is_four_wheel_drive",nullable = false)
    private Boolean isFourWheelDrive;
    @Column(name = "cargo_type",nullable = false)
    private String cargoType;
}
