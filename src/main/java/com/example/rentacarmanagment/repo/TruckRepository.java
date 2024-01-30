package com.example.rentacarmanagment.repo;

import com.example.rentacarmanagment.model.Truck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TruckRepository extends JpaRepository<Truck,Long> {
}
