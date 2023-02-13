package Sem1;

public class Milk extends CursedProducts {

    // Процент жирности
    private double fatContent;

    public Milk(String name, double price, int amount, int expirationDate, double fatContent) {
        super(name, price, amount, expirationDate);
        this.fatContent = fatContent;
    }

    @Override
    public String toString() {
       return String.format("%s, fatContent = %.1f%%", super.toString(), fatContent);
    }
}
