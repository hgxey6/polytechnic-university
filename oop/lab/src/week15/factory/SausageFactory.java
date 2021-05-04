package week15.factory;

import week15.domain.ingredient.Ingredient;
import week15.domain.product.Product;
import week15.domain.product.Sausage;

public class SausageFactory implements ProductFactory {
    
    @Override
    public Product createProduct(Ingredient... ingredients) {
        Product sausage = new Sausage();

        for (Ingredient i : ingredients) {
            sausage.addIngredient(i);
        }

        return sausage;
    }
}
