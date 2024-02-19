package com.example.rentacarmanagment.service.impl;

import com.example.rentacarmanagment.dto.MotorbikeDto;
import com.example.rentacarmanagment.dto.request.MotorbikeRequest;
import com.example.rentacarmanagment.exception.ResourceNotFoundException;
import com.example.rentacarmanagment.mapper.MotorbikeMapper;
import com.example.rentacarmanagment.model.Motorbike;
import com.example.rentacarmanagment.repo.MotorbikeRepository;
import com.example.rentacarmanagment.service.MotorbikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MotorbikeServiceImpl implements MotorbikeService {

    private final MotorbikeRepository repository;
    private final MotorbikeMapper mapper;

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
        findById(id);
        Motorbike motorbike = mapper.entityToRequest(request);
        motorbike.setId(id);
        return mapper.dtoToEntity(motorbike);
    }

    private Motorbike findById(Long id){
        return repository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Motorbike",id.toString(),id));
    }
}
