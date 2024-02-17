package com.example.rentacarmanagment.mapper;

import com.example.rentacarmanagment.dto.OwnerDto;
import com.example.rentacarmanagment.dto.request.OwnerRequest;
import com.example.rentacarmanagment.model.Owner;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OwnerMapper {

    OwnerDto entityToDto(Owner owner);
    Owner requestToEntity(OwnerRequest request);
    List<OwnerDto> entityToDtoList(List<Owner> owners);

}
