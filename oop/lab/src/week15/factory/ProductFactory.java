package week15.factory;

import week15.domain.ingredient.Ingredient;
import week15.domain.product.Product;

public interface ProductFactory {
    Product createProduct(Ingredient... ingredients);
}
