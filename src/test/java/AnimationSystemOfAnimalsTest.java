import junit.framework.TestCase;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.yakunin.animationsystemofanimals.AnimationSystemOfAnimals;
import ru.yakunin.animationsystemofanimals.configurations.ApplicationConfiguration;

public class AnimationSystemOfAnimalsTest extends TestCase {
    public void testGetHerbivoresAnimals() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        AnimationSystemOfAnimals animationSystemOfAnimals =
                context.getBean("animationSystemOfAnimals", AnimationSystemOfAnimals.class);
        int herbivoresAnimalsCount =
                animationSystemOfAnimals.getHerbivoresAnimals().size();
        assertEquals(6582, herbivoresAnimalsCount);
    }

    public void testGetHerbivoresOrCarnivoresAndSmallAnimals() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        AnimationSystemOfAnimals animationSystemOfAnimals =
                context.getBean("animationSystemOfAnimals", AnimationSystemOfAnimals.class);
        int herbivoresOrCarnivoresAndSmallAnimalsCount =
                animationSystemOfAnimals.getHerbivoresOrCarnivoresAndSmallAnimals().size();
        assertEquals(4423, herbivoresOrCarnivoresAndSmallAnimalsCount);
    }

    public void testGetOmnivoresAndNotTallAnimals() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        AnimationSystemOfAnimals animationSystemOfAnimals =
                context.getBean("animationSystemOfAnimals", AnimationSystemOfAnimals.class);
        int OmnivoresAndNotTallAnimalsCount =
                animationSystemOfAnimals.getOmnivoresAndNotTallAnimals().size();
        assertEquals(4499, OmnivoresAndNotTallAnimalsCount);
    }
}
