package com.example.rentacarmanagment.service.impl;

import com.example.rentacarmanagment.dto.MotorbikeDto;
import com.example.rentacarmanagment.dto.request.MotorbikeRequest;
import com.example.rentacarmanagment.exception.ApplicationException;
import com.example.rentacarmanagment.exception.ResourceNotFoundException;
import com.example.rentacarmanagment.exception.enums.Exceptions;
import com.example.rentacarmanagment.mapper.MotorbikeMapper;
import com.example.rentacarmanagment.model.Motorbike;
import com.example.rentacarmanagment.repo.MotorbikeRepository;
import com.example.rentacarmanagment.service.MotorbikeService;
import com.example.rentacarmanagment.service.OwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MotorbikeServiceImpl implements MotorbikeService {

    private final MotorbikeRepository repository;
    private final MotorbikeMapper mapper;
    private final OwnerService ownerService;

    @Override
    public MotorbikeDto getById(Long id) {
        return mapper.dtoToEntity(findById(id));
    }

    @Override
    public List<MotorbikeDto> getList() {
        return mapper.entityListToDtoList(repository.findAll());
    }

    @Override
    public void deleteById(Long id) {
        findById(id);
        repository.deleteById(id);
    }

    @Override
    public MotorbikeDto updateById(Long id, MotorbikeRequest request) {
        return repository.findById(id).map(motorbike -> {
            Motorbike entity = mapper.entityToRequest(request);
            entity.setId(id);
            entity.setOwner(ownerService.findById(request.ownerId()));
            return mapper.dtoToEntity(repository.save(entity));
        }).orElseThrow(()-> new ApplicationException(Exceptions.RESOURCE_NOT_EXIST_EXCEPTION));
    }

    private Motorbike findById(Long id){
        return repository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Motorbike",id.toString(),id));
    }
}
