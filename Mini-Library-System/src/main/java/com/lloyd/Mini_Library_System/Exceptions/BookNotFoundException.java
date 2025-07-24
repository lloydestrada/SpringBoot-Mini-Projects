package com.lloyd.Mini_Library_System.Exceptions;

public class BookNotFoundException extends RuntimeException{
    public BookNotFoundException(String message){

        super(message);
    }
}
