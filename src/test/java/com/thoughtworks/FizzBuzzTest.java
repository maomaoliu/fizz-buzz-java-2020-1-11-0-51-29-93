package com.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Test
    public void test_number_division(){
        fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.fizzBuzz(3));
        assertEquals("Buzz", fizzBuzz.fizzBuzz(5));
        assertEquals("Whizz", fizzBuzz.fizzBuzz(7));
    }
}
