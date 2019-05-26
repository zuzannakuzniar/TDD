package edu.sample;

public class WrongAmountException extends RuntimeException {
    public WrongAmountException(){
        super("Wrong number");
    }
}
