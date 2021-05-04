package week15.domain.product;

import week15.domain.ingredient.Ingredient;

public interface Product {

    void info();
    public void addIngredient(Ingredient i);
    public void deleteIngredient(Ingredient i);

}
