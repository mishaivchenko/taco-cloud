package com.example.tacocloud.tacos.data;

import com.example.tacocloud.tacos.Ingredient;

import java.util.List;
import java.util.Optional;

public interface IngredientRepository {

    List<Ingredient> findAll();

    Optional<Ingredient> findById(Long id);

    Ingredient save(Ingredient ingredient);
}
