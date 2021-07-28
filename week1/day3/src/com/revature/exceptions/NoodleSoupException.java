package com.revature.exceptions;

public class NoodleSoupException extends Exception{
    public String message;

    public NoodleSoupException(String m){
        this.message = m;
    }
}
