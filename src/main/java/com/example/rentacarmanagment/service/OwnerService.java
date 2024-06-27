package com.example.rentacarmanagment.service;

import com.example.rentacarmanagment.dto.OwnerDto;
import com.example.rentacarmanagment.dto.request.OwnerRequest;
import com.example.rentacarmanagment.model.Owner;

import java.util.List;

public interface OwnerService {
    OwnerDto getById(Long id);
    List<OwnerDto> getList();
    void deleteById(Long id);
    OwnerDto updateById(Long id, OwnerRequest request);
    Owner findById(Long id);
}
