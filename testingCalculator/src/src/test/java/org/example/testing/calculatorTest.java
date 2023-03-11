package org.example.testing;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class calculatorTest {

    // Instantiate the class to be tested
    private Calculator calculator;

    // This method is executed before each test
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    // Test addition
    @Test
    public void testAdd() {
        int result = calculator.add(2, 3);
        assertEquals(5, result, "2 + 3 should equal 5");
    }

    // Test subtraction
    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 2);
        assertEquals(3, result, "5 - 2 should equal 3");
    }

    // Test multiplication
    @Test
    public void testMultiply() {
        int result = calculator.multiply(4, 5);
        assertEquals(20, result, "4 * 5 should equal 20");
    }

    // Test division
    @Test
    public void testDivide() {
        double result = calculator.divide(10, 2);
        assertEquals(5.0, result, "10 / 2 should equal 5.0");
    }

    // Test division by zero
    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0), "Dividing by zero should throw an ArithmeticException");
    }

    // Test result type
    @Test
    public void testResultType() {
        Object result = calculator.add(2, 3);
        assertEquals(result, (int) result, "Result should be an integer");
    }

}
