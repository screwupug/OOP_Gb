package Sem4.Weapons;

public class MeleeWeapon extends Weapon {

    public MeleeWeapon(String name, int damagePoint, int range) {
        super(name, damagePoint, range);
    }

    @Override
    public String toString() {
        return "Оружие ближнего боя. " + super.toString();
    }
}
