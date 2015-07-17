package com.lessons;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author pertiol
 *         2015-07-16
 */
public class CalculatorTest {
    Calculator calc = new Calculator();
    @Test
    public void testPow() throws Exception {
        calc.pow(2, 3);
        assertEquals(8, calc.getResult(), 1);
    }


}