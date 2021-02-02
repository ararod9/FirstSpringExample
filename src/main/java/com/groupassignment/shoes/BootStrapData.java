package com.groupassignment.shoes;

import com.groupassignment.shoes.model.DressShoe;
import com.groupassignment.shoes.model.Sneaker;
import com.groupassignment.shoes.repository.ShoeRepository;
import com.groupassignment.shoes.repository.SneakerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private ShoeRepository shoeRepository;
    private SneakerRepository sneakerRepository;

    public BootStrapData(ShoeRepository shoeRepository, SneakerRepository sneakerRepository) {
        this.shoeRepository = shoeRepository;
        this.sneakerRepository = sneakerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        DressShoe shoe = new DressShoe();
        shoe.setSize("8");
        shoe.setType("wing tip");
        shoeRepository.save(shoe);

        Sneaker sneaker = new Sneaker("Nike","8");
        sneakerRepository.save(sneaker);


        System.out.println("Amount of shoe: " + shoeRepository.count());
        System.out.println("Amount of sneaker" + sneakerRepository.count());

    }
}
