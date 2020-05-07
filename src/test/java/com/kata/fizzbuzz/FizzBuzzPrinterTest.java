package com.kata.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzPrinterTest {

    @Test
    public void should_return_1_when_having_1() {
        // Act
        assertEquals("1", FizzBuzzPrinter.getFizzBuzz(1));

    }

    @Test
    public void should_return_Fizz_when_having_3() {
        // Act
        assertEquals("Fizz", FizzBuzzPrinter.getFizzBuzz(3));
    }

    @Test
    public void should_return_Buzz_when_having_5() {
        // Act
        assertEquals("Buzz", FizzBuzzPrinter.getFizzBuzz(5));
    }

    @Test
    public void should_return_FizzBuzz_when_having_15() {
        // Act
        assertEquals("FizzBuzz", FizzBuzzPrinter.getFizzBuzz(15));
    }
}
