package Application;

/**
     * @brief Представляет одежду, которая является определенным типом продукта с атрибутом размера.
     */
    public class ClothingProduct extends Product {

        private String size; ///< Размер одежды.

        /**
         * @brief Инициализирует новый экземпляр ClothingProduct.
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
         * @brief Возвращает строковое представление одежды.
         * @return Строковое представление одежды.
         */
        @Override
        public String toString() {
            return super.toString() + String.format(" - Размер: %s", this.size);
        }
    }