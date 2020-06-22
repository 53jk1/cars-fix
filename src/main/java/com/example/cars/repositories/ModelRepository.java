package com.example.cars.repositories;

import com.example.cars.model.Model;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ModelRepository extends CrudRepository<Model, Long> {

    List<Model> getAllByBrandsIsContaining(com.example.cars.model.Brand brands);
    Optional<Model> getFirstByGeneration(String generation);

}

