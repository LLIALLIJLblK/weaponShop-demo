package com.example.deveducatecore.service;

import com.example.deveducatecore.entity.Salesman;
import com.example.deveducatecore.repository.SalesmanRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
@RequiredArgsConstructor
public class SalesmanService {
    private final SalesmanRepository salesmanRepository;

    public Salesman findSalesmanById(Long id) {
        return salesmanRepository.findById(id).orElse(null);
    }

    public Salesman addSalesman(Salesman salesman) {     // maybe void as well
        return salesmanRepository.saveAndFlush(salesman);
    }

    public void editSalesman(Salesman salesman) {
        salesmanRepository.saveAndFlush(salesman);
    }

    public void deleteSalesman(Long id) {
        salesmanRepository.deleteById(id);
    }

    public Optional<Salesman> findSalesmanByName(String salesmanName) {
        return salesmanRepository.findSalesmanBySalesmanName(salesmanName);
    }
    public List<Salesman> findAll(){
        return salesmanRepository.findAll();
    }
}
