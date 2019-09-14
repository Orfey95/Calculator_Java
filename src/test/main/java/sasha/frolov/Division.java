package test.main.java.sasha.frolov;

import main.java.sasha.frolov.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class Division {
    @Test
    @DisplayName("6 / 3 = 2")
    void addsTwoNumbers() {
        Main main = new Main();
        assertEquals(2, main.division(6, 3), "6 / 3 should equal 2");
    }

    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "40,    4,   10",
            "42424,    0,   0",
            "10,  5, 2",
            "8,  4, 2"
    })

    void div(int first, int second, int expectedResult) {
        Main main = new Main();
        assertEquals(expectedResult, main.division(first, second),
                () -> first + " / " + second + " should equal " + expectedResult);
    }
}