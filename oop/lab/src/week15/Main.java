package week15;

import week15.domain.ingredient.StewedMeatIngredient;
import week15.domain.product.Product;
import week15.domain.ingredient.SausageIngredient;
import week15.factory.ProductFactory;
import week15.factory.SausageFactory;
import week15.factory.StewedMeatFactory;

public class Main {
    public static void main(String[] args) {
        ProductFactory sausageFactory = new SausageFactory();
        Product sausage = sausageFactory.createProduct(SausageIngredient.CHEESE, SausageIngredient.CHICKEN);
        sausage.info();

        ProductFactory stewedMeatFactory = new StewedMeatFactory();
        Product stewedMeat = stewedMeatFactory.createProduct(StewedMeatIngredient.FRIED, SausageIngredient.BEEF);
        stewedMeat.info();

    }
}
