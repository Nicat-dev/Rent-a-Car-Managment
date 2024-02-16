package com.example.rentacarmanagment.mapper;

import com.example.rentacarmanagment.dto.request.RegisterRequest;
import com.example.rentacarmanagment.dto.request.ResponseCustomer;
import com.example.rentacarmanagment.model.Customer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    Customer requestToEntity(RegisterRequest request);
    ResponseCustomer entityToDto(Customer customer);
    List<ResponseCustomer> entityListToDtoList(List<Customer> customers);
}
