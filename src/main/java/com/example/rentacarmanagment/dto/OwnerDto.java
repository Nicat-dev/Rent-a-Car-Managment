package com.example.rentacarmanagment.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OwnerDto {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private String location;
}
