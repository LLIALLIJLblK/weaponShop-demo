package com.example.deveducatecore.repository;

import com.example.deveducatecore.entity.Weapon;
import com.example.deveducatecore.enums.ClipType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WeaponRepository extends JpaRepository<Weapon, Long> {
    List<Weapon> findWeaponByWeaponType(String weaponType);
    List<Weapon> findWeaponByWeaponName(String weaponName);
    List<Weapon> findWeaponByWeaponBuildersCountry(String weaponBuildersCountry);
    List<Weapon> findWeaponByAutomatic(Boolean automatic);
    List<Weapon> findWeaponByCaliber(String caliber);
    List<Weapon> findWeaponByWeaponMass(Double weaponMass);
    List<Weapon> findWeaponByMaxBulletSpeed(Integer maxBulletSpeed);
    List<Weapon> findWeaponByClipType(ClipType clipType);
    List<Weapon> findWeaponByBulletCount(Integer bulletCount);
    Optional<Weapon> findWeaponBySerialCode(String serialCode);
    List<Weapon> findWeaponByPrice(Double price);
}
