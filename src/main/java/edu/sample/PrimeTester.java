package edu.sample;

public class PrimeTester {

    public static boolean primeNumber(Integer number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }
}
