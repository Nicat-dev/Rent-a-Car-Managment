package com.example.rentacarmanagment.controller;

import com.example.rentacarmanagment.dto.CarDto;
import com.example.rentacarmanagment.dto.request.CarRequest;
import com.example.rentacarmanagment.service.CarService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/car")
public class CarController {

    private final CarService service;

    @GetMapping("/{id}")
    public ResponseEntity<CarDto> getById(@Valid @PathVariable Long id) {
        final var dto = service.getById(id);
        return ResponseEntity.ok().body(dto);
    }

    @GetMapping
    public ResponseEntity<List<CarDto>> getList() {
        final var dtoList = service.getList();
        return ResponseEntity.ok().body(dtoList);
    }

    @PostMapping
    public ResponseEntity<CarDto> save(@Valid @RequestBody CarRequest request) {
        final var dto = service.save(request);
        final var location = ServletUriComponentsBuilder.fromCurrentContextPath()
                .build(dto.getId());
        return ResponseEntity.created(location).body(dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
