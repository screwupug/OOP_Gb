package Sem1;

public class CursedProducts extends Product {
    private int expirationDate;


    public CursedProducts(String name, double price, int amount, int expirationDate) {
        super(name, price, amount);
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return String.format("%s expiration date = %d дней", super.toString(), expirationDate);
    }
}
