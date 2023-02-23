package Sem4;

import Sem4.Shields.Armor;
import Sem4.Shields.WearableShield;
import Sem4.Warriors.Archer;
import Sem4.Warriors.FootMan;
import Sem4.Warriors.Warrior;
import Sem4.Weapons.MeleeWeapon;
import Sem4.Weapons.RangedWeapon;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Team<Warrior> team1 = new Team<>("Команда 1") {{
            addAllMembers
                    (
                            List.of
                                    (
                                            new FootMan
                                                    (
                                                            "Мечник", 30,
                                                            new MeleeWeapon
                                                                    (
                                                                            "Меч", 10, 5
                                                                    ),
                                                            new WearableShield
                                                                    (
                                                                            "Деревянный щит", 20
                                                                    )
                                                    ),
                                            new FootMan
                                                    (
                                                            "Копейщик", 20,
                                                            new MeleeWeapon
                                                                    (
                                                                            "Копье", 25, 15
                                                                    )
                                                    ),
                                            new FootMan
                                                    (
                                                            "Рыцарь", 50,
                                                            new MeleeWeapon
                                                                    (
                                                                            "Рыцарский меч", 30, 10
                                                                    ),
                                                            new WearableShield
                                                                    (
                                                                            "Железный щит", 40
                                                                    )
                                                    )
                                    )
                    );
        }};

        Team<Warrior> team2 = new Team<>("Команда 2") {{
            addAllMembers
                    (
                            List.of
                                    (
                                            new FootMan
                                                    (
                                                            "Пехотинец", 20,
                                                            new MeleeWeapon
                                                                    (
                                                                            "Меч", 10, 5
                                                                    ),
                                                            new WearableShield
                                                                    (
                                                                            "Кожанный щит", 25
                                                                    )
                                                    ),
                                            new FootMan
                                                    (
                                                            "Королевский копейщик", 15,
                                                            new MeleeWeapon
                                                                    (
                                                                            "Копье", 40, 15
                                                                    )
                                                    ),
                                            new Archer
                                                    (
                                                            "Лучник", 15,
                                                            new RangedWeapon
                                                                    (
                                                                            "Лук", 15, 30
                                                                    ),
                                                            new Armor
                                                                    (
                                                                            "Кольчуга", 25
                                                                    )
                                                    )
                                    )
                    );
        }};

        GameField gameField = new GameField(50, team1, team2);
        gameField.start();
    }
}
