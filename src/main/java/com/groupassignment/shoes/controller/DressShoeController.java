package com.groupassignment.shoes.controller;


import com.groupassignment.shoes.repository.ShoeRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //making this class a Spring bean
public class DressShoeController {

    private ShoeRepository shoeRepository;

    public DressShoeController(ShoeRepository shoeRepository) {
        this.shoeRepository = shoeRepository;
    }

    @RequestMapping("/dresshoe")
    public String getMapping(Model model){
        model.addAttribute(shoeRepository.findAll());
        return "dressshoes";
    }
}
