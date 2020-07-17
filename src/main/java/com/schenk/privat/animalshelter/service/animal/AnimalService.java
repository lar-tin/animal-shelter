package com.schenk.privat.animalshelter.service.animal;

import java.util.List;

public interface AnimalService {
    List<Animal> getAnimals();

    Animal addAnimal(Animal animal);
}
