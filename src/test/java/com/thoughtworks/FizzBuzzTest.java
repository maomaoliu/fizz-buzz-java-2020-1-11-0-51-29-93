package com.thoughtworks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @ParameterizedTest
    @MethodSource("numberAndResultProvider")
    public void test_number_division(int number, String result){
        fizzBuzz = new FizzBuzz();
        assertEquals(result, fizzBuzz.fizzBuzz(number));
    }

    public static Stream<Arguments> numberAndResultProvider() {
        return Stream.of(
                arguments(3, "Fizz"),
                arguments(5, "Buzz"),
                arguments(7, "Whizz")
        );
    }
}
