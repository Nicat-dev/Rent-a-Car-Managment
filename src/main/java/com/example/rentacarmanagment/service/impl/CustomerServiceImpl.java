package com.example.rentacarmanagment.service.impl;

import com.example.rentacarmanagment.dto.request.RegisterRequest;
import com.example.rentacarmanagment.dto.request.ResponseCustomer;
import com.example.rentacarmanagment.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    @Override
    public ResponseCustomer getById(Long id) {
        return null;
    }

    @Override
    public List<ResponseCustomer> getList() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public ResponseCustomer updateById(Long id, RegisterRequest request) {
        return null;
    }
}
