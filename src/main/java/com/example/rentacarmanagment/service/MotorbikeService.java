package com.example.rentacarmanagment.service;

import com.example.rentacarmanagment.dto.MotorbikeDto;
import com.example.rentacarmanagment.dto.request.MotorbikeRequest;

import java.util.List;

public interface MotorbikeService {

    MotorbikeDto getById(Long id);
    List<MotorbikeDto> getList();
    void deleteById(Long id);
    MotorbikeDto updateById(Long id, MotorbikeRequest request);

}
