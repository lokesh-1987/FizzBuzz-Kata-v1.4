package com.kata.fizzbuzz;

class FizzBuzzMain {

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 1; i <= 100 ; i++) {
            System.out.println("FizzBuzz nos : " +fizzBuzz.getFizzBuzz(i));
        }
    }
}
