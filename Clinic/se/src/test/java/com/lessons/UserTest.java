package com.lessons;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @author pertiol
 *         2015-07-18
 */
public class UserTest {

    User test1 = new User("1", "2");
    User test2 = new User("2", "3");
    User test3 = new User("1", "2");




    @Test
    public void testEquals() throws Exception {
        assertTrue(test1.equals(test3));
        assertTrue(!test1.equals(test2));
    }

    @Test
    public void testHashCode() throws Exception {
        assertEquals(test1.hashCode(), test3.hashCode());
       // assertEquals(test1.hashCode(), test2.hashCode());
    }

    @Test
    public void testToString() throws Exception {
        List<User> tests = new ArrayList<User>();

        tests.add(new User("1", "2"));
        tests.add(new User("2", "3"));

        assertTrue(tests.contains(new User("1", "2")));
    }

    @Test
    public void testMap() throws Exception {
        Map<User, User> tests = new HashMap<User, User>();

        tests.put(new User("1", "2"), new User("1", "2"));
        tests.put(new User("2", "3"), new User("2", "3"));
        tests.put(new User("1", "2"), new User("2", "3"));
        assertEquals(2, tests.size());
    }
}