package com.kata.fizzbuzz;

public class FizzBuzzPrinter {

    public static String getFizzBuzz(int i) {
        if(i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        }
        else if(i % 3 == 0) {
            return "Fizz";
        }
        else if (i % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(i);
    }

    public static void print() {
        for(int i = 1 ; i <= 100 ; i++) {
            System.out.println(getFizzBuzz(i));
        }
    }
}
