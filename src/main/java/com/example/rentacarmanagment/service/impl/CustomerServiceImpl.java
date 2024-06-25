package com.example.rentacarmanagment.service.impl;

import com.example.rentacarmanagment.dto.request.RegisterRequest;
import com.example.rentacarmanagment.dto.request.ResponseCustomer;
import com.example.rentacarmanagment.exception.ApplicationException;
import com.example.rentacarmanagment.exception.ResourceExistsException;
import com.example.rentacarmanagment.exception.ResourceIdCanNotBeNull;
import com.example.rentacarmanagment.exception.ResourceNotFoundException;
import com.example.rentacarmanagment.exception.enums.Exceptions;
import com.example.rentacarmanagment.mapper.CustomerMapper;
import com.example.rentacarmanagment.model.Customer;
import com.example.rentacarmanagment.repo.CustomerRepository;
import com.example.rentacarmanagment.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repository;
    private final CustomerMapper mapper;

    @Override
    public ResponseCustomer save(RegisterRequest registerRequest) {
        emailValidation(registerRequest.email());
        return mapper.entityToDto(repository.save(mapper.requestToEntity(registerRequest)));
    }

    @Override
    public ResponseCustomer getById(Long id) {
        return mapper.entityToDto(getCustomer(id));
    }

    @Override
    public List<ResponseCustomer> getList() {
        return mapper.entityListToDtoList(repository.findAll());
    }

    @Override
    public void deleteById(Long id) {
        idNullCheck(id);
        repository.deleteById(id);
    }

    @Override
    public ResponseCustomer updateById(Long id, RegisterRequest request) {
        emailValidation(request.email());
        return repository.findById(id).map(customer -> {
            Customer entity = mapper.requestToEntity(request);
            entity.setId(id);
            return mapper.entityToDto(repository.save(entity));
        }).orElseThrow(() -> new ApplicationException(Exceptions.USER_NOT_FOUND_EXCEPTION));
    }

    private void idNullCheck(Long id) {
        if (Objects.isNull(id)) {
            throw new ResourceIdCanNotBeNull("Customer id cannot be null", "id", id);
        }
    }

    private Customer getCustomer(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Customer", id.toString(), id));
    }

    private void emailValidation(String email) {
        if (repository.existsByEmail(email)) {
            throw new ResourceExistsException("Email is exist", email, email);
        }
    }
}
