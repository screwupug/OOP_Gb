package Sem2;

public abstract class Predator extends Animal {

    public Predator(String nickname) {
        super(nickname);
    }

    @Override
    public String feedAnimal() {
        return "eat meat";
    }
}
