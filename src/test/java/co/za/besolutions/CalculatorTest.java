package co.za.besolutions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.*;
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void init(){
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Two numbers can be added")
    void addTest() {

        double expected = 10;
        double actual = calculator.add(5,5);

        assertEquals(expected, actual, "The add method should add two numbers");
    }

    @Test
    @DisplayName("Two numbers can be multiplied")
    void multiplyTest(){

        double expected = 10;
        double actual = calculator.multiply(5,2);
        assertEquals(expected, actual, "The multiply method returns the multiplication of two numbers");
    }

    @Test
    @DisplayName("The Area of a Circle can be computed")
    void computeCircleAreaTest(){

        double expected = Math.PI*5*5;
        double actual = calculator.computeCircleArea(5);
        assertEquals(expected, actual, "Should calculate the area of a circle");
    }

    @Test
    @DisplayName("Dividing By Zero Throws DivideByZeroException")
    void divideExceptionTest(){

        assertThrows(Calculator.DivisionByZero.class, () -> calculator.divide(1,0), "Division by zero throws DivideByZeroException");
    }

    @Test
    @DisplayName("Two Numbers can be divided")
    void divideTest() throws Calculator.DivisionByZero {

        boolean isServerUp = true;

        double expected = 2.5;
        double actual = calculator.divide(5,2);
        assumeTrue(isServerUp, "The test must be executed only when the server is up");
        assertEquals(expected, actual, "Two Numbers should be divided");
    }
}