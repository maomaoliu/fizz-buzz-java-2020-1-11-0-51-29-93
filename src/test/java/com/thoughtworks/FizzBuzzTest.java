package com.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Test
    public void test_number_division(){
        fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Fizz", fizzBuzz.fizzBuzz(3));
        Assert.assertEquals("Buzz", fizzBuzz.fizzBuzz(5));
        Assert.assertEquals("Whizz", fizzBuzz.fizzBuzz(7));
    }
}
