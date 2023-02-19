package Sem2;

public class Cat extends Predator implements Runnable {

    public Cat(String nickname) {
        super(nickname);
    }

    @Override
    public String toString() {
        return "I'm cat. " + super.toString() + ". My walk speed is " + getSpeedOfRun();
    }

    @Override
    public String say() {
        return "meow-meow";
    }

    @Override
    public int getSpeedOfRun() {
        return 12;
    }
}
