package com.example.deveducatecore.entity.weapon;

import com.example.deveducatecore.enums.ClipType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class AbstractWeapon {
    public String weaponName;
    public String weaponBuildersCountry;
    public boolean automatic;
    public String caliber;
    public double weaponMass;
    public int maxBulletSpeed;
    public ClipType clipType;
    public int bulletCount;
    public String serialCode;
    public double price;

    public void shoot(int bulletCount) {
    }

    public int reload(ClipType clipType) {
        return 0;
    }

    public boolean equalWeapon(AbstractWeapon abstractWeapon) {
        if (abstractWeapon == null || getClass() != abstractWeapon.getClass()) return false;
        if (this == abstractWeapon) return true;
        return this.weaponName == abstractWeapon.weaponName;
    }

    public int hashCodeWeapon() {
        int newSerial = serialCode == null ? 0 : serialCode.hashCode();
        newSerial = 31 * newSerial + maxBulletSpeed;
        return newSerial;
    }
}



