package com.thoughtworks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    private static Stream<Arguments> commonNumberAndResultProvider() {
        return Stream.of(
                arguments(1, "1"),
                arguments(2, "2"),
                arguments(8, "8")
        );
    }

    private static Stream<Arguments> dividableNumberAndResultProvider() {
        return Stream.of(
                arguments(3, "Fizz"),
                arguments(5, "Buzz"),
                arguments(7, "Whizz")
        );
    }

    private static Stream<Arguments> multiDividableNumberAndResultProvider() {
        return Stream.of(
                arguments(15, "FizzBuzz"),
                arguments(21, "FizzWhizz"),
                arguments(35, "BuzzWhizz"),
                arguments(105, "FizzBuzzWhizz")
        );
    }

    @ParameterizedTest
    @MethodSource({
            "dividableNumberAndResultProvider",
            "commonNumberAndResultProvider",
            "multiDividableNumberAndResultProvider"
    })
    public void test_fizz_buzz(int number, String result) {
        fizzBuzz = new FizzBuzz();
        assertEquals(result, fizzBuzz.fizzBuzz(number));
    }
}
