package com.devops.training;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CalculatorTest {
    
    private Calculator calculator;
    
    @Before
    public void setUp() {
        calculator = new Calculator();
    }
    
    @Test
    public void testAdd() {
        assertEquals(15, calculator.add(10, 5));
        assertEquals(0, calculator.add(-5, 5));
        assertEquals(-10, calculator.add(-5, -5));
    }
    
    @Test
    public void testSubtract() {
        assertEquals(5, calculator.subtract(10, 5));
        assertEquals(-10, calculator.subtract(-5, 5));
        assertEquals(0, calculator.subtract(5, 5));
    }
    
    @Test
    public void testMultiply() {
        assertEquals(50, calculator.multiply(10, 5));
        assertEquals(-25, calculator.multiply(-5, 5));
        assertEquals(0, calculator.multiply(0, 5));
    }
    
    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(10, 5));
        assertEquals(-1, calculator.divide(-5, 5));
        assertEquals(0, calculator.divide(0, 5));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(10, 0);
    }
}
