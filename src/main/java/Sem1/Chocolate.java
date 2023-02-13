package Sem1;

public class Chocolate extends Product {

    // Процент какао
    private double cocoaContent;

    public Chocolate(String name, double price, int amount, double cocoaContent) {
        super(name, price, amount);
        this.cocoaContent = cocoaContent;
    }

    @Override
    public String toString() {
        return String.format("%s, cocoaContent = %.1f%%", super.toString(), cocoaContent);
    }
}
