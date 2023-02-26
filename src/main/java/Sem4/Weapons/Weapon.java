package Sem4.Weapons;

import Sem4.Damageable;

public abstract class Weapon implements Damageable {
    private String name;
    private int damagePoint;
    private int range;

    public Weapon(String name, int damagePoint, int range) {
        this.name = name;
        this.damagePoint = damagePoint;
        this.range = range;
    }

    @Override
    public int damage() {
        return damagePoint;
    }

    public int getRange() {
        return range;
    }

    @Override
    public String toString() {
        return "Название оружия - " + name + ", урон - " + damagePoint + " единиц, дальность - " + range;
    }
}
