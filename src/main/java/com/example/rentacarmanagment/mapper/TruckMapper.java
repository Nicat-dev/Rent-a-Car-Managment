package com.example.rentacarmanagment.mapper;

import com.example.rentacarmanagment.dto.TruckDto;
import com.example.rentacarmanagment.dto.request.TruckRequest;
import com.example.rentacarmanagment.model.Truck;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TruckMapper {

    Truck requestToEntity(TruckRequest request);
    TruckDto dtoToEntity(Truck truck);


}
