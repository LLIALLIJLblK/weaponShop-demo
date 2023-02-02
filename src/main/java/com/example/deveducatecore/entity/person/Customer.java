package com.example.deveducatecore.entity.person;

import com.example.deveducatecore.entity.weapon.AbstractWeapon;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Customer extends Person {

    List<AbstractWeapon> curt = new ArrayList<>();

    public Customer(String personName, List<AbstractWeapon> curt) {
        super(personName);
        this.curt = curt;
    }
}
