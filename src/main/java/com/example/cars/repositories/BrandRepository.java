package com.example.cars.repositories;

import com.example.cars.model.Brand;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BrandRepository extends CrudRepository<Brand, Long> {
    Optional<com.example.cars.model.Brand> getFirstByFirstNameAndConcern(String firstName, String concern);

    Optional<Brand> getFirstByFirstName(String firstName);
}