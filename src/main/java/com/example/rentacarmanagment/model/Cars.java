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
public class Cars extends Vehicle{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "doors",nullable = false)
    private Integer doors;
    @Column(name = "number_of_place",nullable = false)
    private Integer numberOfPlace;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

}
