package Application;

public class ElectronicProduct extends Product {

    private int warrantyPeriod;

    public ElectronicProduct(String name, double price, int quantity, int warrantyPeriod) {
        super(name, price, quantity);
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" - Warranty Period: %d months", this.warrantyPeriod);
    }
}