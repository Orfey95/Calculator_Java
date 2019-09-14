package test.java.sasha.frolov;

import main.java.sasha.frolov.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class Multiplication {
    @Test
    @DisplayName("1 * 2 = 2")
    void addsTwoNumbers() {
        Main main = new Main();
        assertEquals(2, main.multiplication(1, 2), "1 * 2 should equal 2");
    }

    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "4,    4,   16",
            "1,    0,   0",
            "5,  5, 25",
            "6,  8, 48"
    })

    void mult(int first, int second, int expectedResult) {
        Main main = new Main();
        assertEquals(expectedResult, main.multiplication(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }
}