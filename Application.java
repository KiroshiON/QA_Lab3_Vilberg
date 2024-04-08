/**
 * Определяет классы продуктов.
 */
public class Application {

    /**
     * Представляет общий продукт с названием, ценой и количеством.
     */
    public static class Product {

        private String name;
        private double price;
        private int quantity;

        /**
         * Инициализирует новый экземпляр продукта.
         * @param name Название продукта.
         * @param price Цена продукта.
         * @param quantity Количество продукта в наличии.
         */
        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        /**
         * Вычисляет общую стоимость инвентаря продукта.
         * @return Общая стоимость инвентаря продукта.
         */
        public double calculateTotal() {
            return this.price * this.quantity;
        }

        /**
         * Возвращает строковое представление продукта.
         * @return Строковое представление продукта.
         */
        @Override
        public String toString() {
            return String.format("%s - Цена: $%.2f - Количество: %d - Общая стоимость: $%.2f", this.name, this.price, this.quantity, this.calculateTotal());
        }
    }

    /**
     * Представляет электронный продукт, который является определенным типом продукта с периодом гарантии.
     */
    public static class ElectronicProduct extends Product {

        private int warrantyPeriod;

        /**
         * Инициализирует новый экземпляр ElectronicProduct.
         * @param name Название электронного продукта.
         * @param price Цена электронного продукта.
         * @param quantity Количество электронного продукта в наличии.
         * @param warrantyPeriod Период гарантии электронного продукта в месяцах.
         */
        public ElectronicProduct(String name, double price, int quantity, int warrantyPeriod) {
            super(name, price, quantity);
            this.warrantyPeriod = warrantyPeriod;
        }

        /**
         * Возвращает строковое представление электронного продукта.
         * @return Строковое представление электронного продукта.
         */
        @Override
        public String toString() {
            return super.toString() + String.format(" - Период гарантии: %d месяцев", this.warrantyPeriod);
        }
    }

    /**
     * Представляет одежду, которая является определенным типом продукта с атрибутом размера.
     */
    public static class ClothingProduct extends Product {

        private String size;

        /**
         * Инициализирует новый экземпляр ClothingProduct.
         * @param name Название одежды.
         * @param price Цена одежды.
         * @param quantity Количество одежды в наличии.
         * @param size Размер одежды.
         */
        public ClothingProduct(String name, double price, int quantity, String size) {
            super(name, price, quantity);
            this.size = size;
        }

        /**
         * Возвращает строковое представление одежды.
         * @return Строковое представление одежды.
         */
        @Override
        public String toString() {
            return super.toString() + String.format(" - Размер: %s", this.size);
        }
    }

    public static void main(String[] args) {
        ElectronicProduct product1 = new ElectronicProduct("Laptop", 1200, 5, 12);
        ClothingProduct product2 = new ClothingProduct("T-Shirt", 20, 10, "M");
        Product product3 = new Product("Book", 10, 20);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
    }
}
