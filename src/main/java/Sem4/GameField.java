package Sem4;

import Sem4.Warriors.Warrior;
import java.util.Random;

// Main logic class of the battle
public class GameField {
    private int distance;

    // moves count
    private int count = 1;
    private Team<Warrior> firstTeam;
    private Team<Warrior> secondTeam;

    // flags
    private boolean firstTeamAttack;
    private boolean secondTeamAttack;

    public GameField(int distance, Team<Warrior> firstTeam, Team<Warrior> secondTeam) {
        this.distance = distance;
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
    }

    // Initialize the battle
    public void start() {
        move();
    }

    // Main method that shows all data
    private void move() {
        stopGame();
        reduceDistance();
        firstTeamAttack = false;
        secondTeamAttack = false;
        System.out.println("----------------------------------------------");
        System.out.printf("Ход номер - %d, дистанция - %d\n", count++, distance);
        sleep(1000);
        System.out.printf("Здоровье \"%s\" - %dед, здоровье \"%s\" - %dед\n",firstTeam.getTeamName(),
                firstTeam.getTeamHealth(), secondTeam.getTeamName(), secondTeam.getTeamHealth());
        sleep(1000);
        System.out.printf("Кол-во воинов \"%s\" - %dед, \"%s\" - %dед\n",firstTeam.getTeamName(), firstTeam.getSize(),
                secondTeam.getTeamName(), secondTeam.getSize());
        System.out.println("----------------------------------------------");
        sleep(1000);
        throwDice(count);
        if (firstTeamAttack) {
            System.out.println("Первая комада атакует!");
            attack(firstTeam, secondTeam);
        } else if (secondTeamAttack) {
            System.out.println("Вторая комада атакует!");
            attack(secondTeam, firstTeam);
        }
    }

    // Decides which team will attack
    private void throwDice(int count) {
        if ((firstTeam.getMaxDistance() >= distance && secondTeam.getMaxDistance() >= distance) || distance == 0) {
            if (count % 2 == 0) {
                firstTeamAttack = true;
            } else {
                secondTeamAttack = true;
            }
        } else if (firstTeam.getMaxDistance() >= distance) {
            firstTeamAttack = true;
        } else if (secondTeam.getMaxDistance() >= distance) {
            secondTeamAttack = true;
        } else {
            System.out.println("Никто не атакует - слишком большая дистанция");
            sleep(500);
            move();
        }
    }

    // Attack logic
    private void attack(Team<Warrior> attackTeam, Team<Warrior> defenseTeam) {
        System.out.println("----------------------------------------------");
        for (Warrior warrior : attackTeam) {
            // checking if the defense team still alive
            stopGame();
            if (warrior.getWeaponRange() >= distance) {
                int target = choosingTarget();
                Warrior attackedWarrior = defenseTeam.getWarrior(target);
                sleep(500);
                warrior.hit(attackedWarrior);
                if (!attackedWarrior.checkHealth()) {
                    System.out.printf("Воин %s погиб!\n", attackedWarrior.getName());
                    defenseTeam.removeWarrior(target);
                    sleep(500);
                }
                System.out.println("----------------------------------------------");
            }
        }
        move();
    }

    // Reduces the distance (Value is fixed)
    private void reduceDistance() {
        if (distance <= 0) {
            distance = 0;
        } else {
            distance -= 10;
        }
    }

    // Thread sleep method
    private void sleep(int sec) {
        try {
            Thread.sleep(sec);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // Exit the program when reached
    private void stopGame() {
        if (firstTeam.getSize() == 0 || secondTeam.getSize() == 0) {
            System.out.printf("Бой окончен! Победила команда \"%s\"", firstTeam.getSize() > 0 ?
                    firstTeam.getTeamName() : secondTeam.getTeamName());
            System.exit(0);
        }
    }

    // Chooses the enemy to attack based on Random value from the enemy list size
    private int choosingTarget() {
        if (firstTeamAttack) return new Random().nextInt(secondTeam.getSize());
        if (secondTeamAttack) return new Random().nextInt(firstTeam.getSize());

        return -1;
    }
}
