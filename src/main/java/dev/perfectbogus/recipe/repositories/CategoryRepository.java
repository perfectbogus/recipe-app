package dev.perfectbogus.recipe.repositories;

import dev.perfectbogus.recipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
