package sealed;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

class AnimalTest {

    List<Animal> animals = Arrays.asList(new Cat(), new Dog());
    Random rand = new Random();

    @Test
    void testInstanceOf() {
        Animal animal = animals.get(rand.nextInt(animals.size()));

        if (animal instanceof Dog d) {
            d.woof();
        } else if (animal instanceof Cat c) {
            c.meow();
        }
    }
}