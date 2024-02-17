package com.example.rentacarmanagment.service.impl;

import com.example.rentacarmanagment.dto.request.RegisterRequest;
import com.example.rentacarmanagment.dto.request.ResponseCustomer;
import com.example.rentacarmanagment.exception.ResourceExistsException;
import com.example.rentacarmanagment.exception.ResourceNotFoundException;
import com.example.rentacarmanagment.mapper.CustomerMapper;
import com.example.rentacarmanagment.model.Customer;
import com.example.rentacarmanagment.repo.CustomerRepository;
import com.example.rentacarmanagment.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repository;
    private final CustomerMapper mapper;

    @Override
    public ResponseCustomer save(Customer customer) {
        ifExist(customer.getId());
        return mapper.entityToDto(repository.save(customer));
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
        ifNotExist(id);
        repository.deleteById(id);
    }

    @Override
    public ResponseCustomer updateById(Long id, RegisterRequest request) {
        ifNotExist(id);
        Customer customer = getCustomer(id);
        customer = mapper.requestToEntity(request);
        return mapper.entityToDto(repository.save(customer));
    }

    private void ifNotExist(Long id){
        if (!repository.existsById(id)){
            throw new ResourceNotFoundException("Customer",id.toString(),id);
        }
    }

    private void ifExist(Long id){
        if (repository.existsById(id)){
            throw new ResourceExistsException("Customer",id.toString(),id);
        }
    }

    private Customer getCustomer(Long id){
        return repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Customer",id.toString(),id));
    }
}
