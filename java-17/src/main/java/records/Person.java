package records;

import util.ValidationException;

public record Person(String name, int age) {

    public Person {
        if (age > 70) {
            throw new ValidationException("Too old, is probably dead");
        }
    }
}
