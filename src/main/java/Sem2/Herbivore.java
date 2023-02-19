package Sem2;

public abstract class Herbivore extends Animal {

    public Herbivore(String nickname) {
        super(nickname);
    }

    @Override
    public String feedAnimal() {
        return "eat herbs";
    }
}
