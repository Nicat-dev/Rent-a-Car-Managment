package com.example.rentacarmanagment.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseCustomer {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private Integer age;
}
