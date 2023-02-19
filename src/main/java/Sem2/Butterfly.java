package Sem2;

public class Butterfly extends Herbivore implements Flyable {

    @Override
    public String toString() {
        return "I'm butterfly. " + super.toString() + ". My fly speed is " + getSpeedOfFly();
    }

    @Override
    public int getSpeedOfFly() {
        return 5;
    }

    public Butterfly(String nickname) {
        super(nickname);
    }

    @Override
    public String say() {
        return "butterfly voice";
    }
}
