package edu.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFinder {


    public static List<Integer> primeFinder(int number) {
        List<Integer> list = new ArrayList<>();
        int counter = 0;
        int prime = 2;
        if(number==0 || number <0){
            throw new WrongAmountException();
        }
        do {
            if (PrimeTester.primeNumber(prime)) {
                list.add(prime);
                counter++;

            }
            prime++;
        } while (counter != number);
        return list;
    }
}