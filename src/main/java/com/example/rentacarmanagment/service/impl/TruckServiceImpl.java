package com.example.rentacarmanagment.service.impl;

import com.example.rentacarmanagment.dto.TruckDto;
import com.example.rentacarmanagment.dto.request.TruckRequest;
import com.example.rentacarmanagment.exception.ResourceExistsException;
import com.example.rentacarmanagment.exception.ResourceNotFoundException;
import com.example.rentacarmanagment.mapper.TruckMapper;
import com.example.rentacarmanagment.model.Truck;
import com.example.rentacarmanagment.repo.TruckRepository;
import com.example.rentacarmanagment.service.TruckService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TruckServiceImpl implements TruckService {

    private final TruckMapper mapper;
    private final TruckRepository repository;

    @Override
    public TruckDto getById(Long id) {
        return mapper.dtoToEntity(findById(id));
    }

    @Override
    public TruckDto save(TruckRequest request) {
        if (!repository.existsById(request.id())){
            throw new ResourceExistsException("Truck is exist","Truck",request);
        }
        return mapper.dtoToEntity(repository.save(mapper.requestToEntity(request)));
    }

    @Override
    public void deleteById(Long id) {
        findById(id);
        repository.deleteById(id);
    }

    @Override
    public TruckDto update(Long id, TruckRequest request) {

        return null;
    }

    private Truck findById(Long id){
        return repository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Truck cannot find","Truck",id));
    }
}
