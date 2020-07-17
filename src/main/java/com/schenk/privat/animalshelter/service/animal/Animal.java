package com.schenk.privat.animalshelter.service.animal;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class Animal {
    private String id;
    private AnimalTypeEnum type;
    private String name;
    private GenderEnum gender;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    public Animal(String id, AnimalTypeEnum type, String name, GenderEnum gender, LocalDate birthday) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AnimalTypeEnum getType() {
        return type;
    }

    public void setType(AnimalTypeEnum type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
