package com.lesson;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by java on 15.07.2015.
 */
public class CalculatorTest {

    @Test
    public void testDiv() throws Exception {
        Calculator calc = new Calculator();
        calc.div(2, 2);
        Assert.assertEquals(1.0, calc.getResult());
    }
}