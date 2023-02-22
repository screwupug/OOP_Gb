package Sem4;

import Sem4.Warriors.Warrior;
import Sem4.Weapons.Weapon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Warrior> implements Iterable<T> {
    private List<T> team = new ArrayList<>();
    private String teamName;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addMember(T warrior) {
        team.add(warrior);
    }

    public void addAllMembers(List<T> list) {
        team.addAll(list);
    }

    public int getSize() {
        return team.size();
    }

    public Warrior getWarrior(int index) {
        return team.get(index);
    }

    public void removeWarrior(int index) {
        team.remove(index);
    }

    public int getTeamHealth() {
        int teamHealth = 0;
        for (Warrior warrior : team) {
            teamHealth += warrior.getHealth();
        }
        return teamHealth;
    }

    public String getTeamName() {
        return teamName;
    }

    @Override
    public Iterator<T> iterator() {
        return team.iterator();
    }

    public int getMaxDistance() {
        int maxDistance = 0;
        for (Warrior item : team) {
            if (item.getWeaponRange() > maxDistance) {
                maxDistance = item.getWeaponRange();
            }
        }
        return maxDistance;
    }
}
