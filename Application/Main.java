package Application;

public class Main {

    public static void main(String[] args) {
        // Создаем экземпляры продуктов
        ElectronicProduct product1 = new ElectronicProduct("Laptop", 1200, 5, 12);
        ClothingProduct product2 = new ClothingProduct("T-Shirt", 20, 10, "M");
        Product product3 = new Product("Book", 10, 20);

        // Выводим информацию о продуктах
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);

        // Обновляем информацию о продукте
        product1.setPrice(1300);
        product1.setQuantity(7);

        // Проверяем методы геттеров и сеттеров
        System.out.println("Updated price of product1: $" + product1.getPrice());
        System.out.println("Updated quantity of product1: " + product1.getQuantity());

        // Проверяем метод calculateTotal
        System.out.println("Total cost of product1: $" + product1.calculateTotal());

        // Добавляем продукты в корзину
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        // Выводим информацию о корзине
        System.out.println("\nShopping Cart:");
        System.out.println(cart);

        // Удаляем продукт из корзины
        cart.removeProduct(product2.getName());

        // Выводим обновленную информацию о корзине
        System.out.println("\nUpdated Shopping Cart:");
        System.out.println(cart);
    }
}

