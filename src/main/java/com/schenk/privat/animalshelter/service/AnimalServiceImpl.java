package com.schenk.privat.animalshelter.service;

import com.schenk.privat.animalshelter.db.AnimalEntity;
import com.schenk.privat.animalshelter.db.AnimalRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnimalServiceImpl implements AnimalService {

    private final AnimalRepository animalRepository;

    AnimalServiceImpl(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public List<String> getAnimals() {
        List<String> result = this.animalRepository.findAll()
                .stream()
                .map(entity -> entity.getName())
                .collect(Collectors.toList());
        return result;
    }
}
