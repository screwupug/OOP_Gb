package Sem2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        List<Animal> list = zoo.addAnimals(List.of(new Cat("Cat"), new Dog("Dog"), new Sheep("Sheep"), new Duck("Duck"), new Butterfly("Butterfly"), new Alligator("Alligator"), new Platypus("Platypus")));

        System.out.println("Animals voice");
        for (Sayable item : zoo.getSayable()) {
            System.out.println(item.say());
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Runnable animals");
        for (Runnable item : zoo.getRunnable()) {
            System.out.println(item.toString());
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Flyable animals");
        for (Flyable item : zoo.getFlyable()) {
            System.out.println(item.toString());
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Swimmable animals");
        for (Swimmable item : zoo.getSwimmable()) {
            System.out.println(item.toString());
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Runnable max animal");
        System.out.println(zoo.getRunWinner().toString());
        System.out.println("---------------------------------------------------");
        System.out.println("Flyable max animal");
        System.out.println(zoo.getFlyWinner().toString());
        System.out.println("---------------------------------------------------");
        System.out.println("Swimmable max animal");
        System.out.println(zoo.getSwimWinner().toString());
    }
}
