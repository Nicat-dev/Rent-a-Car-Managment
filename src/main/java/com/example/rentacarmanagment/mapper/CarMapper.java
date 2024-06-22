package com.example.rentacarmanagment.mapper;

import com.example.rentacarmanagment.dto.CarDto;
import com.example.rentacarmanagment.dto.request.CarRequest;
import com.example.rentacarmanagment.model.Cars;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {

    CarDto entityToDto(Cars cars);
    Cars dtoToEntity(CarDto carDto);
    Cars entityToRequest(CarRequest request);
    List<CarDto> entityListToDtoList(List<Cars> cars);

}
