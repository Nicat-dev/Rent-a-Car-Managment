package com.example.rentacarmanagment.repo;

import com.example.rentacarmanagment.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
