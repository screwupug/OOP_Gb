package Sem4.Weapons;

public class RangedWeapon extends Weapon {

    public RangedWeapon(String name, int damagePoint, int range) {
        super(name, damagePoint, range);
    }

    @Override
    public String toString() {
        return "Оружие дальнего боя. " + super.toString();
    }
}
