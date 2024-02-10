package com.example.rentacarmanagment.service.impl;

import com.example.rentacarmanagment.dto.CarDto;
import com.example.rentacarmanagment.model.Cars;
import com.example.rentacarmanagment.service.CarService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public CarDto save(Cars cars) {
        return null;
    }

    @Override
    public CarDto getById(Long id) {
        return null;
    }

    @Override
    public List<CarDto> getList() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
