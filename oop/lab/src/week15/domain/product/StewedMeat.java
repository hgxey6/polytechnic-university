package week15.domain.product;

import week15.domain.ingredient.Ingredient;

import java.util.HashSet;
import java.util.Set;

public class StewedMeat implements Product {

    private Set<Ingredient> ingredients;

    public StewedMeat() {
        ingredients = new HashSet<>();
    }

    public void addIngredient(Ingredient s) {
        ingredients.add(s);
    }

    public void deleteIngredient(Ingredient s) {
        ingredients.remove(s);
    }

    @Override
    public void info() {
        System.out.print("Stewed meat composition: ");
        for (Ingredient i : ingredients) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
