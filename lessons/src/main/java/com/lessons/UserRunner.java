package com.lessons;

import java.util.*;

/**
 * @author pertiol
 *         2015-07-17
 */
public class UserRunner {
    public static void main(String[] args) {
        List<User> users = new LinkedList<>();
        users.add(new User("1", "first"));
        users.add(new User("2", "second"));
        users.add(new User("1", "first"));

        for (User user : users) {
            System.out.println(user);
        }
    }
}
