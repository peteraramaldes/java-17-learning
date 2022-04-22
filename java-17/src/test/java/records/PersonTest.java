package records;

import org.junit.jupiter.api.Test;

import util.ValidationException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PersonTest {

    @Test
    void testSomething() {
        // Given
        String name = "Peter";
        int age = 27;

        // When
        Person p = new Person(name, age);

        // Then
        assertEquals(name, p.name());
        assertEquals(age, p.age());
    }

    @Test
    void testDeadGuy() {
        // Given
        String name = "Christopher Plummer";
        int age = 91;

        // When
        assertThrows(ValidationException.class, () -> new Person(name, age), "Too old, is probably dead");
    }
    
    @Test
    void testFoo() {
        // Given
        String name = "Peter";
        int age = 27;

        // When
        Person p = new Person(name, age);

        // Then
        assertEquals(name, p.name());
        assertEquals(age, p.age());
    }
}