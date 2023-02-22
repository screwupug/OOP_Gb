package Sem4.Warriors;

import Sem4.Shields.Armor;
import Sem4.Weapons.MeleeWeapon;
import Sem4.Weapons.RangedWeapon;

public class Archer extends Warrior<RangedWeapon, Armor> {

    public Archer(String name, int health, RangedWeapon weapon, Armor shield) {
        super(name, health, weapon, shield);
    }

    public Archer(String name, int health, RangedWeapon weapon) {
        super(name, health, weapon);
    }
}
