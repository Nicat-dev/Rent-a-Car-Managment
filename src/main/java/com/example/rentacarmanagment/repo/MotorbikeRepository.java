package com.example.rentacarmanagment.repo;

import com.example.rentacarmanagment.model.Motorbike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotorbikeRepository extends JpaRepository<Motorbike,Long> {
}
