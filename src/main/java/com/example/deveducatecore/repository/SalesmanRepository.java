package com.example.deveducatecore.repository;

import com.example.deveducatecore.entity.Salesman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SalesmanRepository extends JpaRepository<Salesman, Long> {
    Optional<Salesman> findSalesmanBySalesmanName(String name);
}
