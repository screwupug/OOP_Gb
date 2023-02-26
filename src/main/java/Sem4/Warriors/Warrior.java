package Sem4.Warriors;

import Sem4.Shields.Shield;
import Sem4.Weapons.Weapon;
import java.util.Random;

// Abstract class for Warriors
public abstract class Warrior<W extends Weapon, S extends Shield> {
    private String name;
    private W weapon;
    private S shield;
    private int health;

    public Warrior(String name, int health, W weapon, S shield) {
        this.name = name;
        this.weapon = weapon;
        this.health = health;
        this.shield = shield;
    }

    // Constructor for warriors without shield
    public Warrior(String name, int health, W weapon) {
        this.name = name;
        this.weapon = weapon;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public W getWeapon() {
        return weapon;
    }

    public S getShield() {
        return shield;
    }

    public int getHealth() {
        return health;
    }

    public int getWeaponRange() {
        return weapon.getRange();
    }

    public int getShieldDurability() {
        return shield.protect();
    }

    private int damageFork() {
        return new Random().nextInt(weapon.damage());
    }

    // Register damage
    public boolean hit(Warrior enemy) {
        int damage = damageFork();
        int remainingDamage = enemy.tryToProtectDamage(damage);
        if (remainingDamage == 0) {
            System.out.printf("%s атаковал %s, урона нанесено - %dед, заблокировано - %dед." +
                            " Здоровье - %dед, прочность щита - %dед\n", name, enemy.getName(), damage,
                    damage, enemy.health, enemy.shield != null ? enemy.getShieldDurability() : 0);
            return false;
        } else {
            enemy.reduceHealth(remainingDamage);
            System.out.printf("%s атаковал %s, урона нанесено - %dед, заблокировано - %dед. " +
                            " Здоровье - %dед, прочность щита - %dед\n", name, enemy.getName(), damage,
                    damage - remainingDamage, enemy.health, enemy.shield != null ? enemy.getShieldDurability() : 0);
            return true;
        }
    }

    // Checks out if shield can receive damage or not
    private int tryToProtectDamage(int damage) {
        if (shield == null) return damage;
        return shield.refreshDurability(damage);
    }

    private void reduceHealth(int remainingDamage) {
        health -= remainingDamage;
    }

    public boolean checkHealth() {
        return health > 0;
    }

    @Override
    public String toString() {
        if (shield != null) {
            return "Тип воина - " + name + ", здоровье - " + health + "ед\n" + weapon.toString() + "\n" + shield.toString();
        }
        return "Тип воина - " + name + ", здоровье - " + health + "ед\n" + weapon.toString() + "\nЩита нет";
    }
}
