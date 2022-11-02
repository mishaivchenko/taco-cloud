package com.example.tacocloud.tacos;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor()
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Table
public class Ingredient implements Persistable<String> {
    @Id
    private String id;
    private String name;
    private Type type;

    @Override
    @Transient
    public boolean isNew() {
        return id == null;
    }

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
