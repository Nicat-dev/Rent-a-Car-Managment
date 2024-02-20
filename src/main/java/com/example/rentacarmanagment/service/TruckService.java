package com.example.rentacarmanagment.service;

import com.example.rentacarmanagment.dto.TruckDto;
import com.example.rentacarmanagment.dto.request.TruckRequest;

public interface TruckService {

    TruckDto getById(Long id);
    TruckDto save(TruckRequest request);
    void deleteById(Long id);
    TruckDto update(Long id , TruckRequest request);

}
