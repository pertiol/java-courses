package com.lessons;

/**
 * Exception for no arguments from command line
 * @author pertiol
 */
public class UserException extends Exception{
    UserException(String message) {
        super(message);
    }
}
