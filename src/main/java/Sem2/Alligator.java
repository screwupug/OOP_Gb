package Sem2;

public class Alligator extends Predator implements Runnable, Swimmable {

    @Override
    public String toString() {
        return "I'm alligator. " + super.toString() + ". My walk speed is " + getSpeedOfRun() + ". My swim speed is " + getSpeedOfSwim();
    }

    public Alligator(String nickname) {
        super(nickname);
    }

    @Override
    public int getSpeedOfRun() {
        return 3;
    }

    @Override
    public String say() {
        return "alligator voice";
    }

    @Override
    public int getSpeedOfSwim() {
        return 10;
    }
}
