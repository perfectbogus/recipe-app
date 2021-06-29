package dev.perfectbogus.recipe.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private String description;
    private BigDecimal amount;

    @ManyToMany
    private Set<Category> categories;

    @Enumerated(value = EnumType.STRING)
    private Difficulty difficulty;

    @ManyToOne
    private Recipe recipe;

    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasure uom;

}
