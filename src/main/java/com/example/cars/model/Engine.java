package com.example.cars.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.HashSet;
import java.util.Set;

public class Engine {


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getkW() {
        return kW;
    }

    public void setkW(String kW) {
        this.kW = kW;
    }

    public String getKM() {
        return KM;
    }

    public void setKM(String KM) {
        this.KM = KM;
    }

    public Set<Engine> getEngines() {
        return engines;
    }

    public void setEngines(Set<Engine> engines) {
        this.engines = engines;
    }

    public Engine(Long id, String capacity, String kW, String KM, Set<Engine> engines) {
        this.id = id;
        this.capacity = capacity;
        this.kW = kW;
        this.KM = KM;
        this.engines = engines;
    }

    public Engine() {
    }

    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", capacity='" + capacity + '\'' +
                ", kW='" + kW + '\'' +
                ", KM='" + KM + '\'' +
                ", engines=" + engines +
                '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String capacity;
    private String kW;
    private String KM;

    private Set<Engine> engines = new HashSet<>();
}
