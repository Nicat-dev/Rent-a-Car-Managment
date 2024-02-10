package com.example.rentacarmanagment.mapper;

import com.example.rentacarmanagment.dto.request.RegisterRequest;
import com.example.rentacarmanagment.dto.request.ResponseCustomer;
import com.example.rentacarmanagment.model.Cars;
import com.example.rentacarmanagment.model.Customer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {
    Customer requestToEntity(RegisterRequest request);
    ResponseCustomer entityToDto(Cars cars);
    List<ResponseCustomer> entityListToDtoList(List<Customer> customers);
}
