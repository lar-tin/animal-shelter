package com.schenk.privat.animalshelter.api;

import com.schenk.privat.animalshelter.service.AnimalServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/animalshelter/animals")
public class AnimalRestController {

    private final AnimalServiceImpl animalService;

    AnimalRestController(AnimalServiceImpl animalServiceImpl){
        this.animalService = animalServiceImpl;
    }

    @GetMapping
    public List<String> getAnimals() {
        return animalService.getAnimals();
    }
}
