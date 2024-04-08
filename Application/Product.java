package Application;
/**
     * @brief Представляет общий продукт с названием, ценой и количеством.
     * \image html image.png width=500cm
     */
    public class Product {

        private String name; ///< Название продукта.
        private double price; ///< Цена продукта.
        private int quantity; ///< Количество продукта в наличии.

        /**
         * @brief Инициализирует новый экземпляр продукта.
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
         * @brief Вычисляет общую стоимость инвентаря продукта.
         * @return Общая стоимость инвентаря продукта.
         */
        public double calculateTotal() {
            return this.price * this.quantity;
        }

        /**
         * @brief Возвращает строковое представление продукта.
         * @return Строковое представление продукта.
         */
        @Override
        public String toString() {
            return String.format("%s - Цена: $%.2f - Количество: %d - Общая стоимость: $%.2f", this.name, this.price, this.quantity, this.calculateTotal());
        }
    }
