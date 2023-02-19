package Sem2;

public class Sheep extends Herbivore implements Runnable {

    public Sheep(String nickname) {
        super(nickname);
    }

    @Override
    public String say() {
        return "sheep voice";
    }

    @Override
    public String toString() {
        return "I'm sheep. " + super.toString() + ". My walk speed is " + getSpeedOfRun();
    }

    @Override
    public int getSpeedOfRun() {
        return 10;
    }
}
