package com.example.rentacarmanagment.mapper;

import com.example.rentacarmanagment.dto.MotorbikeDto;
import com.example.rentacarmanagment.dto.request.MotorbikeRequest;
import com.example.rentacarmanagment.model.Motorbike;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MotorbikeMapper {

    MotorbikeDto dtoToEntity(Motorbike motorbike);
    Motorbike entityToRequest(MotorbikeRequest request);
    List<Motorbike> entityListToDtoList(List<MotorbikeDto> motorbikeDtoList);
}
