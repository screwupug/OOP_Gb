package Sem2;

public class Platypus extends Herbivore implements Runnable, Swimmable {

    @Override
    public String toString() {
        return "I'm platypus. " + super.toString() + ". My walk speed is " + getSpeedOfRun() + ". My swim speed is " + getSpeedOfSwim();
    }

    public Platypus(String nickname) {
        super(nickname);
    }

    @Override
    public int getSpeedOfRun() {
        return 3;
    }

    @Override
    public String say() {
        return "platypus voice";
    }

    @Override
    public int getSpeedOfSwim() {
        return 13;
    }
}
