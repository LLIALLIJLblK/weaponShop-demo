package com.example.deveducatecore.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "salesman", schema = "weaponshop1")
public class Salesman {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long salesmanId;

    @Column
    private String salesmanName;
}
