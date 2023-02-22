package Sem4;

import Sem4.Shields.Armor;
import Sem4.Shields.WearableShield;
import Sem4.Warriors.Archer;
import Sem4.Warriors.FootMan;
import Sem4.Warriors.Warrior;
import Sem4.Weapons.MeleeWeapon;
import Sem4.Weapons.RangedWeapon;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Team<Warrior> team1 = new Team<>("Команда 1")
        {{
            addAllMembers
                    (
                            List.of
                                    (
                                           new FootMan("Мечник", 10, new MeleeWeapon("Меч", 15, 10), new WearableShield("Деревянный щит", 30, 10)),
                                            new FootMan("Копейщик", 10, new MeleeWeapon("Копье", 25, 20)),
                                            new FootMan("Рыцарь", 50, new MeleeWeapon("Рыцарский меч", 30,10), new WearableShield("Железный щит", 100,20 ))
                                    )
                    );
        }};

        Team<Warrior> team2 = new Team<>("Команда 2")
        {{
            addAllMembers
                    (
                            List.of
                                    (
                                            new FootMan("Мечник", 10, new MeleeWeapon("Меч", 15, 10), new WearableShield("Деревянный щит", 30, 10)),
                                            new FootMan("Копейщик", 10, new MeleeWeapon("Копье", 25, 20)),
                                            new Archer("Лучник", 10, new RangedWeapon("Лук", 10, 25), new Armor("Кольчуга", 20))
                                    )
                    );
        }};

        GameField gameField = new GameField(30, team1, team2);
        gameField.start();
    }
}
