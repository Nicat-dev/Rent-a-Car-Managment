package com.example.rentacarmanagment.service;

import com.example.rentacarmanagment.dto.CarDto;
import com.example.rentacarmanagment.dto.request.CarRequest;
import com.example.rentacarmanagment.model.Cars;

import java.util.List;

public interface CarService {
    CarDto save(CarRequest carRequest);
    CarDto update(CarRequest request,Long id);
    CarDto getById(Long id);
    List<CarDto> getList();
    void deleteById(Long id);
}
