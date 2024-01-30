package com.example.rentacarmanagment.repo;

import com.example.rentacarmanagment.model.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Cars,Long> {
}
