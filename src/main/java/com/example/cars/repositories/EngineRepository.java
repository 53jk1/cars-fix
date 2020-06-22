package com.example.cars.repositories;

import com.example.cars.model.Engine;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface EngineRepository extends CrudRepository<Engine, Long> {
    Optional<Engine> getEngineBykW(String kW);
}