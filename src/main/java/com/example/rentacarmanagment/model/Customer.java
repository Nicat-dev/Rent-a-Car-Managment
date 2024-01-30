package com.example.rentacarmanagment.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "surname",nullable = false)
    private String surname;
    @Email
    @Column(name = "email",nullable = false)
    private String email;
    @Column(name = "passport_number",nullable = false)
    private String passportNumber;
    @Column(name = "location",nullable = false)
    private String location;
    @Column(name = "nationality")
    private String nationality;
    @Column(name = "age")
    private Integer age;
}
