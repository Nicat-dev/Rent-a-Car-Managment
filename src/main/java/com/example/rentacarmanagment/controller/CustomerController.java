package com.example.rentacarmanagment.controller;

import com.example.rentacarmanagment.dto.request.RegisterRequest;
import com.example.rentacarmanagment.dto.request.ResponseCustomer;
import com.example.rentacarmanagment.service.CustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService service;

    @GetMapping("/{id}")
    public ResponseEntity<ResponseCustomer> get(@PathVariable Long id){
        final var dto = service.getById(id);
        return ResponseEntity.ok().body(dto);
    }

    @GetMapping
    public ResponseEntity<List<ResponseCustomer>> getAll(){
        final var dto = service.getList();
        return ResponseEntity.ok().body(dto);
    }

    @PostMapping
    public ResponseEntity<ResponseCustomer> save(@Valid @RequestBody RegisterRequest request){
        final var dto = service.save(request);
        final var location = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("{/id}").build(dto.getId());
        return ResponseEntity.created(location).body(dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
