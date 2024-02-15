package com.example.rentacarmanagment.service;

import com.example.rentacarmanagment.dto.MotorbikeDto;

import java.util.List;

public interface MotorbikeService {

    MotorbikeDto getById(Long id);
    List<MotorbikeDto> getList();
    void deleteById(Long id);
    MotorbikeDto updateById(Long id);

}
