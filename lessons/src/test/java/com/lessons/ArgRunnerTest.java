package com.lessons;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Aleks on 2015-07-16.
 */
public class ArgRunnerTest {
    String[] test = {"1", "/", "0"};
    @Test (expected = UserException.class)
    public void testMain() throws UserException {
        ArgRunner.main(test);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testDiv() throws UserException {
        ArgRunner.main(test);
    }
}