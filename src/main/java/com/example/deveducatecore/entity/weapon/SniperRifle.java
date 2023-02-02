package com.example.deveducatecore.entity.weapon;

import com.example.deveducatecore.enums.ClipType;

public class SniperRifle extends AbstractWeapon {

    public SniperRifle(String weaponName, String weaponBuildersCountry, boolean automatic, String caliber, double weaponMass, int maxBulletSpeed, ClipType clipType, int bulletCount, String serialCode, double price) {
        super(weaponName, weaponBuildersCountry, automatic, caliber, weaponMass, maxBulletSpeed, clipType, bulletCount, serialCode, price);
    }

    @Override
    public void shoot(int bulletCount) {
        int startBullet = bulletCount;
        System.out.println("Gun is shooting ");
        bulletCount = bulletCount - 1;
        System.out.println("Bullets before shoot is " + startBullet + ". Bullets current: " + bulletCount);
    }

    @Override
    public int reload(ClipType clipType) {
        System.out.println(ClipType.CAROB_CLIP_SNIPERRIFLE.getClip() + " has been reloaded: " + bulletCount);
        return bulletCount;
    }
}
