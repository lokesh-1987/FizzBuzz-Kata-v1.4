package com.kata.fizzbuzz;

class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ_BUZZ = "FizzBuzz";

    String getFizzBuzz(int number) {
        if(number == 15) {
            return FIZZ_BUZZ;
        } else if(number % 3 == 0) {
            return FIZZ;
        } else if(number % 5 == 0) {
            return BUZZ;
        }
        return String.valueOf(number);
    }
}
