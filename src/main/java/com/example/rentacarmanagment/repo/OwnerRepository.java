package com.example.rentacarmanagment.repo;

import com.example.rentacarmanagment.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner,Long> {
}
