package Application;

public class Main {
    /**
     * @brief Точка входа в программу.
     * 
     * \f$(x_1,y_1)\f$
     * 
     * Создает и выводит информацию о продуктах.
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        ElectronicProduct product1 = new ElectronicProduct("Laptop", 1200, 5, 12);
        ClothingProduct product2 = new ClothingProduct("T-Shirt", 20, 10, "M");
        Product product3 = new Product("Book", 10, 20);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
    }
}
