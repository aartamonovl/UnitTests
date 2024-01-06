package homework1.Shop;

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */

public class ShopTest {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.generateProducts();
        System.out.println(shop.getMostExpensiveProduct().getCost());
        shop.sortProductsByPrice();
        shop.getProducts().stream().mapToInt(Product::getCost).forEach(System.out::println);
    }
}