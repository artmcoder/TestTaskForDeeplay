package ru.yakunin.animationsystemofanimals;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.yakunin.animationsystemofanimals.configurations.ApplicationConfiguration;
import ru.yakunin.animationsystemofanimals.models.Animal;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        AnimationSystemOfAnimals animationSystemOfAnimals =
                context.getBean("animationSystemOfAnimals", AnimationSystemOfAnimals.class);
        List<Animal> herbivoresAnimals = animationSystemOfAnimals.getHerbivoresAnimals();
        System.out.println("Травоядные животные (Количество: " + herbivoresAnimals.size() + ")");
//        herbivoresAnimals.forEach(System.out::println);
        List<Animal> herbivoresOrCarnivoresAndSmallAnimals =
                animationSystemOfAnimals.getHerbivoresOrCarnivoresAndSmallAnimals();
        System.out.println("Травоядные или плотоядные и при этом маленькие животные (Количество: "
                + herbivoresOrCarnivoresAndSmallAnimals.size() + ")");
//        herbivoresOrCarnivoresAndSmallAnimals.forEach(System.out::println);
        List<Animal> omnivoresAndNotTallAnimals =
                animationSystemOfAnimals.getOmnivoresAndNotTallAnimals();
        System.out.println("Всеядных и не высокие животные (Количество: "
                + omnivoresAndNotTallAnimals.size() + ")");
//        omnivoresAndNotTallAnimals.forEach(System.out::println);
        context.close();
    }
}
