import junit.framework.TestCase;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.yakunin.animationsystemofanimals.configurations.ApplicationConfiguration;
import ru.yakunin.animationsystemofanimals.parsers.AnimalParser;

public class AnimalParserTest extends TestCase {
    public void testParseAnimals() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        AnimalParser animalParser =
                context.getBean("animalParser", AnimalParser.class);
        assertEquals(20000, animalParser.parseAnimals().size());
    }
}
