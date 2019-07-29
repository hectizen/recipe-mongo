package com.hj.recipe.service;

import com.hj.recipe.command.RecipeCommand;
import com.hj.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(String l);

    RecipeCommand findCommandById(String l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(String idToDelete);
}
