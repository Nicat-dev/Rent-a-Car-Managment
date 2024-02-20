package com.example.rentacarmanagment.service;

import com.example.rentacarmanagment.dto.request.RegisterRequest;
import com.example.rentacarmanagment.dto.request.ResponseCustomer;
import com.example.rentacarmanagment.model.Customer;

import java.util.List;

public interface CustomerService {

    ResponseCustomer save(RegisterRequest registerRequest);
    ResponseCustomer getById(Long id);
    List<ResponseCustomer> getList();
    void deleteById(Long id);
    ResponseCustomer updateById(Long id, RegisterRequest request);


}
