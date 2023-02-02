package com.example.deveducatecore.entity;

import com.example.deveducatecore.enums.ClipType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "weapon", schema = "weaponshop1")
public class Weapon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long weaponId;

    @Column
    private String weaponType;
    @Column
    private String weaponName;
    @Column
    private String weaponBuildersCountry;
    @Column
    private Boolean automatic;
    @Column
    private String caliber;
    @Column(name ="weapon_mass")
    private Double weaponMass;
    @Column
    private Integer maxBulletSpeed;
    @Column
    @Enumerated(EnumType.STRING)
    private ClipType clipType;
    @Column
    private Integer bulletCount;
    @Column
    private String serialCode;
    @Column
    private Double price;

    @ManyToOne()
    private Customer customer_id;

//    @OneToMany(cascade = CascadeType.ALL)// if delete customer then delet all weapons
//    @NotFound(action = NotFoundAction.IGNORE)
//    private List<Customer> customer;

}
