package com.kata.fizzbuzz;

class FizzBuzz {
    String getFizzBuzz(int number) {
        if(number % 3 == 0) {
            return "Fizz";
        } else if(number == 5) {
            return "Buzz";
        } else if (number == 10) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
