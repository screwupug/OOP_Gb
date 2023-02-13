package Sem1;

import java.util.ArrayList;
import java.util.List;

public class WendingMachine {


    private List<Product> products = new ArrayList<>();
    private double balance;


    public WendingMachine addProduct(Product product) {
        products.add(product);
        return this;
    }

    public double getBalance() {
        return balance;
    }

    public void getAllProducts() {
       for (Product item : products) {
           System.out.println(item.toString());
       }
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product findProduct(String name) {
        for (Product item : products) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public boolean buyProduct(String name, int amount) {
        Product product = findProduct(name);
        if (product != null) {
            balance += product.getPrice() * amount;
            if (product.getAmount() != 0 && (product.getAmount() - amount) >= 0) {
                product.setAmount(product.getAmount() - amount);
                if (product.getAmount() == 0) {
                    removeProduct(product);
                }
                return true;
            } else {
                System.out.println("Такого кол-ва товара нет в наличии");
                return false;
            }
        }
        System.out.println("Такого товара нет");
        return false;
    }

    private void removeProduct(Product product) {
        if (product.getAmount() == 0) {
            products.remove(product);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Product item : products) {
            builder.append(item.toString()).append("\n");
        }
        builder.append("баланс = ").append(balance).append("руб");
        return builder.toString();
    }
}
