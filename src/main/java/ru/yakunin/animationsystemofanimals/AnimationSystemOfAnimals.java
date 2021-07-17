package ru.yakunin.animationsystemofanimals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.yakunin.animationsystemofanimals.models.Animal;
import ru.yakunin.animationsystemofanimals.parsers.AnimalParser;

import java.util.ArrayList;
import java.util.List;

@Component
public class AnimationSystemOfAnimals {
    private final AnimalParser animalParser;
    private final String HERBIVOROUS_ANIMAL = "ТРАВОЯДНОЕ";
    private final String OMNIVORES_ANIMAL = "ВСЕЯДНОЕ";
    private final String CARNIVOROUS_ANIMAL = "ПЛОТОЯДНОЕ";
    private final String LITTLE_ANIMAL = "МАЛЕНЬКОЕ";
    private final String HIGH_ANIMAL = "ВЫСОКОЕ";

    @Autowired
    public AnimationSystemOfAnimals(AnimalParser animalParser) {
        this.animalParser = animalParser;
    }

    public List<Animal> getHerbivoresAnimals() {
        List<Animal> herbivoresAnimals = new ArrayList<>();
        animalParser.parseAnimals().forEach(animal -> {
            if (animal.getType().equals(HERBIVOROUS_ANIMAL)) {
                herbivoresAnimals.add(animal);
            }
        });
        return herbivoresAnimals;
    }

    public List<Animal> getHerbivoresOrCarnivoresAndSmallAnimals() {
        List<Animal> herbivoresOrCarnivoresAndSmallAnimals =
                new ArrayList<>();
        animalParser.parseAnimals().forEach(animal -> {
            if (animal.getType().equals(HERBIVOROUS_ANIMAL) ||
                    animal.getType().equals(CARNIVOROUS_ANIMAL)) {
                if (animal.getHeight().equals(LITTLE_ANIMAL)) {
                    herbivoresOrCarnivoresAndSmallAnimals.add(animal);
                }
            }
        });
        return herbivoresOrCarnivoresAndSmallAnimals;
    }

    public List<Animal> getOmnivoresAndNotTallAnimals() {
        List<Animal> omnivoresAndNotTallAnimals =
                new ArrayList<>();
        animalParser.parseAnimals().forEach(animal -> {
            if (!animal.getHeight().equals(HIGH_ANIMAL)) {
                if (animal.getType().equals(OMNIVORES_ANIMAL)) {
                    omnivoresAndNotTallAnimals.add(animal);
                }
            }
        });
        return omnivoresAndNotTallAnimals;
    }
}
