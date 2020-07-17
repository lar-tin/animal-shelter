package com.schenk.privat.animalshelter.service.animal;

import com.schenk.privat.animalshelter.db.AnimalEntity;
import com.schenk.privat.animalshelter.db.AnimalRepository;
import com.schenk.privat.animalshelter.db.AnimalType;
import com.schenk.privat.animalshelter.db.Gender;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnimalServiceImpl implements AnimalService {

    private final AnimalRepository animalRepository;

    AnimalServiceImpl(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public List<Animal> getAnimals() {
        List<Animal> result = this.animalRepository.findAll()
                .stream()
                .map(entity -> toAnimal(entity))
                .collect(Collectors.toList());
        return result;
    }

    @Override
    public Animal addAnimal(Animal animal) {
        return toAnimal(this.animalRepository.save(toAnimalEntity(animal)));
    }

    private static AnimalEntity toAnimalEntity(Animal animal) {
        AnimalEntity animalEntity = new AnimalEntity();
        animalEntity.setType(AnimalType.valueOf(animal.getType().name()));
        animalEntity.setName(animal.getName());
        animalEntity.setGender(Gender.valueOf(animal.getGender().name()));
        animalEntity.setBirthday(animal.getBirthday());
        return animalEntity;
    }

    private static Animal toAnimal(AnimalEntity animalEntity) {
        return new Animal(animalEntity.getId(),
                AnimalTypeEnum.valueOf(animalEntity.getType().name()),
                animalEntity.getName(),
                GenderEnum.valueOf(animalEntity.getGender().name()),
                animalEntity.getBirthday()
        );
    }
}
