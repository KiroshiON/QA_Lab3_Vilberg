class Product:
    def __init__(self, name, price, quantity):
        self.name = name
        self.price = price
        self.quantity = quantity

    def calculate_total(self):
        return self.price * self.quantity

    def __str__(self):
        return f"{self.name} - Price: ${self.price} - Quantity: {self.quantity} - Total: ${self.calculate_total()}"


class ElectronicProduct(Product):
    def __init__(self, name, price, quantity, warranty_period):
        super().__init__(name, price, quantity)
        self.warranty_period = warranty_period

    def __str__(self):
        return super().__str__() + f" - Warranty Period: {self.warranty_period} months"


class ClothingProduct(Product):
    def __init__(self, name, price, quantity, size):
        super().__init__(name, price, quantity)
        self.size = size

    def __str__(self):
        return super().__str__() + f" - Size: {self.size}"




product1 = ElectronicProduct("Laptop", 1200, 5, 12)
product2 = ClothingProduct("T-Shirt", 20, 10, "M")
product3 = Product("Book", 10, 20)

print(product1)
print(product2)
print(product3)
