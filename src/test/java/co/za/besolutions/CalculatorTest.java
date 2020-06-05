package co.za.besolutions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.*;

@DisplayName("When running Calculator")
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void init(){
        calculator = new Calculator();
    }

    @Nested
    @DisplayName("add method")
    class AddTest{

        @Test
        @DisplayName("when adding a number and zero")
        void addToZeroTest() {

            double expected = 5;
            double actual = calculator.add(0,5);

            assertEquals(expected, actual, "should return the number");
        }

        @Test
        @DisplayName("when adding two positive numbers")
        void addPositiveTest() {

            double expected = 10;
            double actual = calculator.add(5,5);

            assertEquals(expected, actual, "should return the correct positive sum");
        }

        
        @Test
        @DisplayName("when adding a positive number and a negative number")
        void addNegativeToPositiveTest() {

            double expected = -5;
            double actual = calculator.add(-10,5);

            assertEquals(expected, actual, "should return the right sum");
        }

        @Test
        @DisplayName("when adding two negative numbers")
        void addNegativeTest() {

            double expected = -15;
            double actual = calculator.add(-10,-5);

            assertEquals(expected, actual, "should return a negative correct sum");
        }


    }
    
    @Nested
    @DisplayName("multiply method")
    class MultiplyTest{

        @Test
        @DisplayName("When multiplying by zero")
        void multiplyByZeroTest(){

            double expected = 0;
            double actual = calculator.multiply(50000,0);
            assertEquals(expected, actual, "should return zero");
        }

        @Test
        @DisplayName("When multiplying two Positive Numbers")
        void multiplyPositiveTest(){

            double expected = 15;
            double actual = calculator.multiply(5,3);
            assertEquals(expected, actual, "should return a positive correct product");
        }

        @Test
        @DisplayName("When multiplying a negative number and a positive")
        void multiplyPositiveAndNegativeTest(){

            double expected = -15;
            double actual = calculator.multiply(-5,3);
            assertEquals(expected, actual, "should return a negative correct product");
        }

        @Test
        @DisplayName("When multiplying two negative numbers")
        void multiplyNegativeTest(){

            double expected = 15;
            double actual = calculator.multiply(-5,-3);
            assertEquals(expected, actual, "should return a positive correct product");
        }
        
    }
   

    @Test
    @DisplayName("The computeCircleAreaMethod, given a radius")
    void computeCircleAreaTest(){

        double expected = Math.PI*5*5;
        double actual = calculator.computeCircleArea(5);
        assertEquals(expected, actual, "should return the correct area");
    }
    
    @Nested
    @DisplayName("divide method")
    class DivideTest{

        @Test
        @DisplayName("when dividing by zero")
        void divideExceptionTest(){

            assertThrows(Calculator.DivisionByZero.class, () -> calculator.divide(1,0), "should throw DivideByZeroException");
        }

        @Test
        @DisplayName("When dividing two numbers")
        void divideTest() throws Calculator.DivisionByZero {

            boolean isServerUp = true;

            double expected = 2.5;
            double actual = calculator.divide(5,2);
            assumeTrue(isServerUp, "assuming the server is up");
            assertEquals(expected, actual, "should return the correct quotient");
        }
        
    }
   
}