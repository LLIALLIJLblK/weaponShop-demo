package com.example.deveducatecore.service;


import com.example.deveducatecore.entity.Weapon;
import com.example.deveducatecore.enums.ClipType;
import com.example.deveducatecore.repository.WeaponRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
@RequiredArgsConstructor
public class WeaponService {
    private final WeaponRepository weaponRepository;

    public Weapon findWeaponById(Long id) {
        return weaponRepository.findById(id).orElse(null);
    }
    public List<Weapon> findAll(){
        return weaponRepository.findAll();
    }

    public Weapon addWeapon(Weapon weapon) {
        return weaponRepository.saveAndFlush(weapon);
    }

    public void editWeapon(Weapon weapon) {
        weaponRepository.saveAndFlush(weapon);
    }

    public void deleteWeapon(Long id) {
        weaponRepository.deleteById(id);
    }
    //------------------------------------------
    public List<Weapon> findWeaponByName(String weaponName) {
        return weaponRepository.findWeaponByWeaponName(weaponName);
    }

    public List<Weapon> findWeaponType(String weaponType) {
        return weaponRepository.findWeaponByWeaponType(weaponType);
    }

    public List<Weapon> findWeaponBuildersCountry(String weaponBuildersCountry) {
        return weaponRepository.findWeaponByWeaponBuildersCountry(weaponBuildersCountry);
    }

    public List<Weapon> findAutomatic(Boolean automatic) {
        return weaponRepository.findWeaponByAutomatic(automatic);
    }

    public List<Weapon> findCaliber(String caliber) {
        return weaponRepository.findWeaponByCaliber(caliber);
    }

    public List<Weapon> findWeaponMass(Double weaponMass) {
        return weaponRepository.findWeaponByWeaponMass(weaponMass);
    }

    public List<Weapon> findMaxBulletSpeed(Integer maxBulletSpeed) {
        return weaponRepository.findWeaponByMaxBulletSpeed(maxBulletSpeed);
    }

    public List<Weapon> findClipType(ClipType clipType) {
        return weaponRepository.findWeaponByClipType(clipType);
    }

    public List<Weapon> findBulletCount(Integer bulletCount) {
        return weaponRepository.findWeaponByBulletCount(bulletCount);
    }

    public Optional<Weapon> findSerialCode(String serialCode) {
        return weaponRepository.findWeaponBySerialCode(serialCode);
    }

    public List<Weapon> findPrice(Double price) {
        return weaponRepository.findWeaponByPrice(price);
    }
}
