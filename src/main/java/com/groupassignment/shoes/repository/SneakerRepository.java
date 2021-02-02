package com.groupassignment.shoes.repository;

import com.groupassignment.shoes.model.DressShoe;
import com.groupassignment.shoes.model.Sneaker;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface SneakerRepository extends CrudRepository<Sneaker,Long> {

    Optional<Sneaker> findByBrand(String brand);
}
