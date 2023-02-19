package Sem2;

public abstract class Animal implements Sayable {
    public String nickname;

    public Animal(String nickname) {
        this.nickname = nickname;
    }

    public abstract String feedAnimal();

    public String toString() {
        return "My nickname is " + "\"" + nickname + "\"";
    }

}
