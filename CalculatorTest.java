CalculatorTest

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author lab_services_student
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(4,calculator.add(2,2));
        assertEquals(2,calculator.add(4, -2));
        assertEquals(-4,calculator.add(-2, -2));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-5, calculator.subtract(-2, 3));
        assertEquals(0, calculator.subtract(-4,-4));
    }

    @Test
    public void testMultiply() {
         Calculator calculator = new Calculator();
        assertEquals(4, calculator.multiply(2, 2));
        assertEquals(-12, calculator.multiply(-4,3));
        assertEquals(8, calculator.multiply(-2, -4));
    }
    
}
