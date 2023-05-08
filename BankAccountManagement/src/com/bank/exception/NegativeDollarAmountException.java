package com.bank.exception;

public class NegativeDollarAmountException extends Exception {
    public NegativeDollarAmountException(String message) {
        super(message);
    }
}
