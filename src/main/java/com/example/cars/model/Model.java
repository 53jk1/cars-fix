package com.example.cars.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Data
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
@Entity
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String model;
    private String generation;
    private String year;
    private String concern;

    @ManyToOne
    private Engine engine;

    @ManyToMany
    private Set<Brand> brands = new HashSet<>();

    public Model(Long id, String model, String generation, String year, String concern, Set<Brand> brands) {
        this.id = id;
        this.model = model;
        this.generation = generation;
        this.year = year;
        this.concern = concern;
        this.brands = brands;
    }

    public Song(String title, String genre, String ismn, String year) {
        this.model = model;
        this.generation = generation;
        this.year = year;
        this.concern = concern;
        this.brands = brands;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getConcern() {
        return concern;
    }

    public void setConcern(String concern) {
        this.concern = concern;
    }

    public Set<Brand> getBrands() {
        return brands;
    }

    public void setBrands(Set<Brand> brands) {
        this.brands = brands;
    }
}


