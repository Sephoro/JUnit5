package co.za.besolutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    @Test
    void shouldAddTwoNumbers() {

        Calculator calculator = new Calculator();

        int expected = 10;
        int actual = calculator.add(5,5);

        assertEquals(expected, actual, "The add method should add two numbers");
    }
}