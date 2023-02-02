package com.example.deveducatecore.controller;


import com.example.deveducatecore.entity.Salesman;
import com.example.deveducatecore.service.SalesmanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/salesman")
@RequiredArgsConstructor
public class SalesmanController {
    private final SalesmanService salesmanService;

    @GetMapping(value = "/get/{id}")
    public Salesman getSalesman(@PathVariable("id") Long id) {
        return salesmanService.findSalesmanById(id);
    }

    @PostMapping(value = "/add")
    public Salesman addSalesman(Salesman salesman) {
        return salesmanService.addSalesman(salesman);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteSalesman(@PathVariable("id") Long id) {
        salesmanService.deleteSalesman(id);
    }

    @GetMapping(value = "/name/{name}")
    public Salesman findSalesmanByName(@PathVariable("name") String salesmanName) {
        Salesman salesman = salesmanService.findSalesmanByName(salesmanName).orElse(null);
        if (salesman != null) {
            return salesman;
        } else {
            Salesman salesman1= new Salesman();
            salesman1.setSalesmanName("Salesman not found");
            return salesman1;
        }
    }

    @GetMapping(value = "/get")
    public List<Salesman> findAll() {
        return salesmanService.findAll();
    }
}
