package week15.domain.product;

import week15.domain.ingredient.Ingredient;

import java.util.HashSet;
import java.util.Set;

public class Sausage implements Product {

    private Set<Ingredient> ingredients;

    public Sausage() {
        ingredients = new HashSet<>();
    }

    public void addIngredient(Ingredient i) {
        ingredients.add(i);
    }

    public void deleteIngredient(Ingredient i) {
        ingredients.remove(i);
    }

    @Override
    public void info() {
        System.out.print("Sausage composition: ");
        for (Ingredient i : ingredients) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
