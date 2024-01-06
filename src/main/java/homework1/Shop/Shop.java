package homework1.Shop;

import java.util.*;

public class Shop {
    private List<Product> products;

    public void generateProducts() {
        products = new ArrayList<>();
        products.add(new Product(1, "a"));
        products.add(new Product(3, "b"));
        products.add(new Product(8, "c"));
        products.add(new Product(4, "d"));
    }

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
        products.sort(Comparator.comparingDouble(Product::getCost));
        return products;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        return Collections.max(products, Comparator.comparingDouble(Product::getCost));
    }

}