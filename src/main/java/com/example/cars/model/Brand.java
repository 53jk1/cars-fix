package com.example.cars.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(of = {"id"})
@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String concern;

    public Brand(Long id, String firstName, String concern) {
        this.id = id;
        this.firstName = firstName;
        this.concern = concern;
        //this.models = models;
    }

    @ManyToMany(mappedBy = "brands")
    private Set<Model> models = new HashSet<>();
}
