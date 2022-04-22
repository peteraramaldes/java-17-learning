package switches;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SwitchTest {

    @Test
    void testTodayIsAFreeDay() {
        Switch s = new Switch();
        boolean b = s.isFreeDay();
        assertTrue(b);
    }
}