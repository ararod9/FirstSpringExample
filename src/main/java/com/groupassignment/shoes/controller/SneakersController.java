package com.groupassignment.shoes.controller;

import com.groupassignment.shoes.model.Sneaker;
import com.groupassignment.shoes.repository.SneakerRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class SneakersController{
    private SneakerRepository sneakerRepository;

    public SneakersController(SneakerRepository sneakerRepository) {
        this.sneakerRepository = sneakerRepository;
    }

    @RequestMapping("/sneaker")
    public Sneaker getMapping(){
        Optional<Sneaker> sneaker = sneakerRepository.findByBrand("Nike");
        return sneaker.get();
    }
}
