package com.bank.exception;

public class InvalidPasswordFormatException extends Exception {
    public InvalidPasswordFormatException(String message){
        super(message);
    }
}
