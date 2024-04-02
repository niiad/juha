package dev.niiad.juha.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String condition;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "planet")
    private List<Species> species;

    public Planet() {}

    public Planet(String name, String condition) {
        this.name = name;
        this.condition = condition;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public List<Species> getSpecies() {
        return species;
    }

    public void setSpecies(List<Species> species) {
        this.species = species;
    }
}
