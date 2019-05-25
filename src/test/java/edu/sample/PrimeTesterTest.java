package edu.sample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTesterTest {

    @ParameterizedTest
    @ValueSource(ints={1,5,1200657,17,23,7,8,9})
    public void testPrimeNumber(int number){
        assertTrue(PrimeTester.primeNumber(number));
    }

}