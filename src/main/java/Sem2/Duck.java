package Sem2;

public class Duck extends Herbivore implements Flyable, Runnable, Swimmable {

    public Duck(String nickname) {
        super(nickname);
    }

    @Override
    public String toString() {
        return "I'm duck. " + super.toString() + ". My walk speed is " + getSpeedOfRun() + ". My fly speed is " + getSpeedOfFly() + ". My swim speed is " + getSpeedOfSwim();
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

    @Override
    public int getSpeedOfSwim() {
        return 7;
    }
}
