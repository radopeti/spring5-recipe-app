package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

//this is a crudrepository in the tutorial
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
