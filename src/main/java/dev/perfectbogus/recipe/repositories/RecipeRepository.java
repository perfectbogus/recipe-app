package dev.perfectbogus.recipe.repositories;

import dev.perfectbogus.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
