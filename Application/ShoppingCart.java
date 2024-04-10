package Application;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(String productName) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                this.products.remove(product);
                break;
            }
        }
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Product product : products) {
            totalCost += product.calculateTotal();
        }
        return totalCost;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Product product : products) {
            sb.append(product.toString()).append("\n");
        }
        sb.append("Total Cost: $").append(calculateTotalCost());
        return sb.toString();
    }
}