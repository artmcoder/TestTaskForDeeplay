package ru.yakunin.animationsystemofanimals.parsers;

import org.springframework.stereotype.Component;
import ru.yakunin.animationsystemofanimals.models.Animal;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Component
public class AnimalParser {
    private final String ANIMALS_DATA_FILE_PATH = "src/main/resources/data/animals.txt";

    public List<Animal> parseAnimals() {
        List<Animal> animals = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(ANIMALS_DATA_FILE_PATH));
            for (String line : lines) {
                String[] fragments = line.split("\t");
                if (fragments.length != 3) {
                    continue;
                }
                Animal animal = new Animal(fragments[0], fragments[1], fragments[2]);
                animals.add(animal);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return animals;
    }
}
