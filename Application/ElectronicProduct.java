package Application;
    /**
     * @brief Представляет электронный продукт, который является определенным типом продукта с периодом гарантии.
     */
    public class ElectronicProduct extends Product {

        private int warrantyPeriod; ///< Период гарантии электронного продукта в месяцах.

        /**
         * @brief Инициализирует новый экземпляр ElectronicProduct.
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
         * @brief Возвращает строковое представление электронного продукта.
         * @return Строковое представление электронного продукта.
         */
        @Override
        public String toString() {
            return super.toString() + String.format(" - Период гарантии: %d месяцев", this.warrantyPeriod);
        }
    }
