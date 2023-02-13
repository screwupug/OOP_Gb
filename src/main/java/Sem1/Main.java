package Sem1;

public class Main {
    public static void main(String[] args) {
        WendingMachine machine = new WendingMachine();
        machine.addProduct(new Product("Snickers", 49.99, 4));
        machine.addProduct(new Yogurt("Активия", 39.90, 5, 15, 4.8));
        machine.addProduct(new Beer("Corona Extra", 129.90, 10, 4.8));
        machine.addProduct(new Snack("Tuc", 58.8, 21));
        System.out.println(machine);
        System.out.println("Buying 10 Tucs");
        machine.buyProduct("Tuc", 10);
        System.out.println(machine);
        System.out.println("Buying 4 Snickers");
        machine.buyProduct("Snickers", 4);
        System.out.println(machine);
    }
}