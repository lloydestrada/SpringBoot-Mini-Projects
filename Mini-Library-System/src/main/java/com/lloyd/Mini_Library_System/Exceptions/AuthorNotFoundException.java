package com.lloyd.Mini_Library_System.Exceptions;

public class AuthorNotFoundException extends RuntimeException {
    public AuthorNotFoundException(String message){

        super(message);
    }
}
