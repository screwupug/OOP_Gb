package Sem1;

public class Beer extends Product {

    // Процент алкоголя
    private double alcoholPercentage;

    public Beer(String name, double price, int amount, double alcoholPercentage) {
        super(name, price, amount);
        this.alcoholPercentage = alcoholPercentage;
    }

    @Override
    public String toString() {
        return String.format("%s, alcoholPercentage = %.1f%%", super.toString(), alcoholPercentage);
    }
}
