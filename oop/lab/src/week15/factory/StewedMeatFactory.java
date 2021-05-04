package week15.factory;

import week15.domain.ingredient.Ingredient;
import week15.domain.product.Product;
import week15.domain.product.StewedMeat;

public class StewedMeatFactory implements ProductFactory {

    @Override
    public Product createProduct(Ingredient... ingredients) {
        Product stewedMeat = new StewedMeat();
        
        for (Ingredient i : ingredients) {
            stewedMeat.addIngredient(i);
        }
        
        return stewedMeat;
    }
}
