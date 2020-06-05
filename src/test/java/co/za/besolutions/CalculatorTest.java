package co.za.besolutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    void addTest() {

        double expected = 10;
        double actual = calculator.add(5,5);

        assertEquals(expected, actual, "The add method should add two numbers");
    }

    @Test
    void multiplyTest(){

        double expected = 10;
        double actual = calculator.multiply(5,2);
        assertEquals(expected, actual, "The multiply method returns the multiplication of two numbers");
    }

    @Test
    void computeCircleAreaTest(){

        double expected = Math.PI*5*5;
        double actual = calculator.computeCircleArea(5);
        assertEquals(expected, actual, "Should calculate the area of a circle");
    }
}