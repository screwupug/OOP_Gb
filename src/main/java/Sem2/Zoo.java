package Sem2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();
    private Radio radio = new Radio();


    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> addAnimals(List<Animal> list) {
        animals.addAll(list);
        return animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Sayable> getSayable() {
        List<Sayable> result = new ArrayList<>(animals);
        result.add(radio);
        return result;
    }

    public List<Runnable> getRunnable() {
        List<Runnable> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Runnable) {
                result.add((Runnable) animal);
            }
        }
        return result;
    }

    public List<Flyable> getFlyable() {
        List<Flyable> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                result.add((Flyable) animal);
            }
        }
        return result;
    }

    public List<Swimmable> getSwimmable() {
        List<Swimmable> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Swimmable) {
                result.add((Swimmable) animal);
            }
        }
        return result;
    }

    public Runnable getRunWinner() {
        List<Runnable> list = getRunnable();
        Runnable winner = list.get(0);
        for (Runnable runnable : list) {
            if (runnable.getSpeedOfRun() > winner.getSpeedOfRun()) {
                winner = runnable;
            }
        }
        return winner;
    }

    public Flyable getFlyWinner() {
        List<Flyable> list = getFlyable();
        Flyable winner = list.get(0);
        for (Flyable flyable : list) {
            if (flyable.getSpeedOfFly() > winner.getSpeedOfFly()) {
                winner = flyable;
            }
        }
        return winner;
    }

    public Swimmable getSwimWinner() {
        List<Swimmable> list = getSwimmable();
        Swimmable winner = list.get(0);
        for (Swimmable swimmable : list) {
            if (swimmable.getSpeedOfSwim() > winner.getSpeedOfSwim()) {
                winner = swimmable;
            }
        }
        return winner;
    }
}
