package com.example.deveducatecore.controller;

import com.example.deveducatecore.entity.Weapon;
import com.example.deveducatecore.enums.ClipType;
import com.example.deveducatecore.service.WeaponService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/weapon")
@RequiredArgsConstructor
public class WeaponController {
    private final WeaponService weaponService;

    @GetMapping(value = "/get/{id}")
    public Weapon getWeapon(@PathVariable("id") Long id) {
        return weaponService.findWeaponById(id);
    }

    @PostMapping(value = "/add")
    public Weapon addWeapon(Weapon weapon) {
        return weaponService.addWeapon(weapon);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteWeapon(@PathVariable("id") Long id) {
        weaponService.deleteWeapon(id);
    }

    @GetMapping(value = "/type/{type}")
    public List<Weapon> findWeaponByWeaponType(@PathVariable("type") String weaponType) {
        return weaponService.findWeaponType(weaponType);
    }

    //----------------------------------------------------------------------------------------------
    @GetMapping(value = "/get")
    public List<Weapon> findAll() {
        return weaponService.findAll();
    }

    @GetMapping(value = "/country/{country}")
    public List<Weapon> findWeaponByWeaponBuildersCountry(@PathVariable("country") String weaponCountry) {
        return weaponService.findWeaponBuildersCountry(weaponCountry);
    }
    @GetMapping(value = "/name/{name}")
    public List<Weapon>findWeaponByName(@PathVariable("name")String weaponName){
        return weaponService.findWeaponByName(weaponName);
    }

    @GetMapping(value = "/automatic/{automatic}")
    public List<Weapon> findWeaponByAutomatic(@PathVariable("automatic") Boolean automatic) {
        return weaponService.findAutomatic(automatic);
    }

    @GetMapping(value = "/caliber/{caliber}")
    public List<Weapon> findWeaponByCaliber(@PathVariable("caliber") String caliber) {
        return weaponService.findCaliber(caliber);
    }

    @GetMapping(value = "/mass/{mass}")
    public List<Weapon> findWeaponByWeaponMass(@PathVariable("mass") Double weaponMass) {
        return weaponService.findWeaponMass(weaponMass);
    }

    @GetMapping(value = "/speed/{speed}")
    public List<Weapon> findWeaponByMaxBulletSpeed(@PathVariable("speed") Integer maxBulletSpeed) {
        return weaponService.findMaxBulletSpeed(maxBulletSpeed);
    }

    @GetMapping(value = "/clip/{clip}")
    public List<Weapon> findWeaponByClipType(@PathVariable("clip") ClipType clipType) {
        return weaponService.findClipType(clipType);
    }

    @GetMapping(value = "/bullet/{bullet}")
    public List<Weapon> findWeaponByBulletCount(@PathVariable("bullet") Integer bulletCount) {
        return weaponService.findBulletCount(bulletCount);
    }

    @GetMapping(value = "/serial/{serial}")
    public Optional<Weapon> findWeaponBySerialCode(@PathVariable("serial") String serialCode) {
        return weaponService.findSerialCode(serialCode);
    }

    @GetMapping(value = "/price/{price}")
    public List<Weapon> findWeaponByPrice(@PathVariable("price") Double price) {
        return weaponService.findPrice(price);
    }
}
