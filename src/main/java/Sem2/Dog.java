package Sem2;

public class Dog extends Predator implements Runnable {

    public Dog(String nickname) {
        super(nickname);
    }

    @Override
    public String toString() {
        return "I'm dog. " + super.toString() + ". My walk speed is " + getSpeedOfRun();
    }

    @Override
    public String say() {
        return "gav-gav";
    }

    @Override
    public int getSpeedOfRun() {
        return 20;
    }
}
