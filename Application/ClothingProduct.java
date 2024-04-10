package Application;

public class ClothingProduct extends Product {

    private String size;

    public ClothingProduct(String name, double price, int quantity, String size) {
        super(name, price, quantity);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" - Size: %s", this.size);
    }
}