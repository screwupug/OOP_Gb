package Sem2;

public class Duck extends Herbivore implements Flyable, Runnable {

    public Duck(String nickname) {
        super(nickname);
    }

    @Override
    public String toString() {
        return "I'm duck. " + super.toString() + ". My fly speed is " + getSpeedOfFly() + ". My walk speed is " + getSpeedOfRun();
    }

    @Override
    public int getSpeedOfFly() {
        return 20;
    }


    @Override
    public String say() {
        return "kra-kra";
    }

    @Override
    public int getSpeedOfRun() {
        return 3;
    }
}
