package com.example.rentacarmanagment.service.impl;

import com.example.rentacarmanagment.dto.CarDto;
import com.example.rentacarmanagment.dto.request.CarRequest;
import com.example.rentacarmanagment.exception.ResourceNotFoundException;
import com.example.rentacarmanagment.mapper.CarMapper;
import com.example.rentacarmanagment.model.Cars;
import com.example.rentacarmanagment.repo.CarRepository;
import com.example.rentacarmanagment.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {
    private final CarRepository repository;
    private final CarMapper mapper;

    @Override
    public CarDto save(CarRequest carRequest) {
        return mapper.entityToDto(repository.save(mapper.entityToRequest(carRequest)));
    }

    @Override
    public CarDto update(CarRequest request, Long id) {
        return repository.findById(id).map( cars -> {
                    Cars entity = mapper.entityToRequest(request);
                    entity.setId(id);
                    return mapper.entityToDto(entity);
                }
        ).orElseThrow(()-> new ResourceNotFoundException("Car","id",request));
    }

    @Override
    public CarDto getById(Long id) {
        return mapper.entityToDto(getEntity(id));
    }

    @Override
    public List<CarDto> getList() {
        return mapper.entityListToDtoList(repository.findAll());
    }

    @Override
    public void deleteById(Long id) {
        repository.delete(getEntity(id));
    }

    private Cars getEntity(Long id){
        return repository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Car not found",id.toString(),id));
    }
}
