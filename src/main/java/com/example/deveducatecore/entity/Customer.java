package com.example.deveducatecore.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "customer", schema = "weaponshop1")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    @Column
    private String customerName;


    @OneToMany(cascade = CascadeType.ALL)
    private List<Weapon> weaponId;
}
