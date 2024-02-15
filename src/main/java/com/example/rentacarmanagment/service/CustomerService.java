package com.example.rentacarmanagment.service;

import com.example.rentacarmanagment.dto.request.RegisterRequest;
import com.example.rentacarmanagment.dto.request.ResponseCustomer;

import java.util.List;

public interface CustomerService {

    ResponseCustomer getById(Long id);
    List<ResponseCustomer> getList();
    void deleteById(Long id);
    ResponseCustomer updateById(Long id, RegisterRequest request);


}
