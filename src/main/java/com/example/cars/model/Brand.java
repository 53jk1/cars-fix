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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getConcern() {
        return concern;
    }

    public void setConcern(String concern) {
        this.concern = concern;
    }

    public Set<Model> getModels() {
        return models;
    }

    public void setModels(Set<Model> models) {
        this.models = models;
    }

    public Brand(Long id, String firstName, String concern, Set<Model> models) {
        this.id = id;
        this.firstName = firstName;
        this.concern = concern;
        this.models = models;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", concern='" + concern + '\'' +
                ", models=" + models +
                '}';
    }

    public Brand() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String concern;




    @ManyToMany(mappedBy = "brands")
    private Set<Model> models = new HashSet<>();
}
