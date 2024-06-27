package com.example.rentacarmanagment.service.impl;

import com.example.rentacarmanagment.dto.OwnerDto;
import com.example.rentacarmanagment.dto.request.OwnerRequest;
import com.example.rentacarmanagment.exception.ResourceExistsException;
import com.example.rentacarmanagment.exception.ResourceIdCanNotBeNull;
import com.example.rentacarmanagment.exception.ResourceNotFoundException;
import com.example.rentacarmanagment.mapper.OwnerMapper;
import com.example.rentacarmanagment.model.Owner;
import com.example.rentacarmanagment.repo.OwnerRepository;
import com.example.rentacarmanagment.service.OwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class OwnerServiceImpl implements OwnerService {

    private final OwnerMapper mapper;
    private final OwnerRepository repository;


    @Override
    public OwnerDto getById(Long id) {
        idNullCheck(id);
        return mapper.entityToDto(findById(id));
    }

    @Override
    public List<OwnerDto> getList() {
        return mapper.entityToDtoList(repository.findAll());
    }

    @Override
    public void deleteById(Long id) {
        idNullCheck(id);
        repository.deleteById(id);
    }

    @Override
    public OwnerDto updateById(Long id, OwnerRequest request) {
        idNullCheck(id);
        emailValidation(request.email());
        return null;
    }

    @Override
    public Owner findById(Long id){
        return repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Owner",id.toString(),id));
    }

    private void idNullCheck(Long id){
        if (Objects.isNull(id)){
            throw new  ResourceIdCanNotBeNull("Id cannot be null","id",id);
        }
    }

    private void emailValidation(String email){
        if (repository.existsByEmail(email)){
            throw new ResourceExistsException("Email is exist",email, email);
        }
    }
}
