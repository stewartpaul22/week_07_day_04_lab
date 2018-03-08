package Fantasy_Game;

import Behaviours.IFight;

public class Fighter extends Player {//implements IFight {

    private int protection;
    FighterType fighterType;
    WeaponType weaponType;

    public Fighter(String name, int health, int protection, FighterType fighterType, WeaponType weaponType) {
        super(name, health);
        this.protection = protection;
        this.fighterType = fighterType;
        this.weaponType = weaponType;
    }

    public int getProtection() {
        return protection;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public FighterType getFighterType() {
        return fighterType;
    }


    public WeaponType changeWeapon(WeaponType weapon) {
        return this.weaponType = weapon;
    }
}
