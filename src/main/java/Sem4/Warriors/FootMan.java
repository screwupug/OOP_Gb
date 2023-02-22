package Sem4.Warriors;

import Sem4.Shields.WearableShield;
import Sem4.Weapons.MeleeWeapon;

public class FootMan extends Warrior<MeleeWeapon, WearableShield> {

    public FootMan(String name, int health, MeleeWeapon weapon, WearableShield shield) {
        super(name, health, weapon, shield);
    }

    public FootMan(String name, int health, MeleeWeapon weapon) {
        super(name, health, weapon);
    }
}
