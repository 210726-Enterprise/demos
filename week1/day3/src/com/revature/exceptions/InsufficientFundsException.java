package com.revature.exceptions;

public class InsufficientFundsException extends Exception{
    private String message = "You have insufficient funds for that withdrawal";


    public String getMessage(){
        return message;
    }
}
