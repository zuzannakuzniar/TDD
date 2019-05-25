package edu.sample;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFinderTest {

    @ParameterizedTest
    @ValueSource(ints={1,5,10,15,2460})
    public void testPrimeFinder(int number){
        assertEquals(number, new PrimeFinder().primeFinder(number).size());
    }
    @ParameterizedTest
    @ValueSource(ints={-1,0})
    public void testPrimeFinderExceptions(int numbers){
        assertEquals(numbers,new PrimeFinder().primeFinder(numbers).size());
    }


}