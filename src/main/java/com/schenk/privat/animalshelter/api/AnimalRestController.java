package com.schenk.privat.animalshelter.api;

import com.schenk.privat.animalshelter.service.animal.Animal;
import com.schenk.privat.animalshelter.service.animal.AnimalServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animalshelter/animals")
public class AnimalRestController {

    private final AnimalServiceImpl animalService;

    AnimalRestController(AnimalServiceImpl animalServiceImpl){
        this.animalService = animalServiceImpl;
    }

    @GetMapping
    public List<Animal> getAnimals() {
        return animalService.getAnimals();
    }

    @PostMapping(path = "/add")
    public Animal addAnimal(@RequestBody Animal animal) {
        return animalService.addAnimal(animal);
    }
}
