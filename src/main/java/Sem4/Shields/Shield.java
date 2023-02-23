package Sem4.Shields;

import Sem4.Protectable;

// Abstract class for shields
public abstract class Shield implements Protectable {
    private String type;
    private int durability;

    public Shield(String type, int durability) {
        this.type = type;
        this.durability = durability;
    }

    @Override
    public int protect() {
        return durability;
    }

    // Method to refresh durability after receiving damage
    public int refreshDurability(int damage) {
        if (durability == 0) return damage;
        int remainingDamage = 0;
        if (durability >= damage) {
            durability -= damage;
        } else {
            remainingDamage = damage - durability;
            durability = 0;
        }
        return remainingDamage;
    }

    @Override
    public String toString() {
        return "Тип щита - " + type + ", прочность - " + durability + "ед";
    }
}
