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
                arguments(6, "Fizz"),
                arguments(5, "Buzz"),
                arguments(10, "Buzz"),
                arguments(7, "Whizz"),
                arguments(14, "Whizz")
        );
    }

    private static Stream<Arguments> multiDividableNumberAndResultProvider() {
        return Stream.of(
                arguments(21, "FizzWhizz"),
                arguments(60, "FizzBuzz"),
                arguments(140, "BuzzWhizz"),
                arguments(420, "FizzBuzzWhizz")
        );
    }

    private static Stream<Arguments> Including3ButNot5NumberAndResultProvider() {
        return Stream.of(
                arguments(3, "Fizz"),
                arguments(30, "Fizz")
        );
    }

    private static Stream<Arguments> Including5ButNot7NumberAndResultProvider() {
        return Stream.of(
                arguments(5, "Buzz"),
                arguments(15, "Buzz"),
                arguments(35, "BuzzWhizz"),
                arguments(105, "BuzzWhizz")
        );
    }

    private static Stream<Arguments> Including7NumberAndResultProvider() {
        return Stream.of(
                arguments(7, "Whizz"),
                arguments(75, "Fizz"),
                arguments(73, "Fizz"),
                arguments(37, "Fizz"),
                arguments(147, "FizzWhizz"),
                arguments(735, "Fizz"),
                arguments(17, "17")
        );
    }

    @ParameterizedTest
    @MethodSource({
            "dividableNumberAndResultProvider",
            "commonNumberAndResultProvider",
            "multiDividableNumberAndResultProvider",
            "Including3ButNot5NumberAndResultProvider",
            "Including5ButNot7NumberAndResultProvider",
            "Including7NumberAndResultProvider"
    })
    public void test_fizz_buzz(int number, String result) {
        fizzBuzz = new FizzBuzz();
        assertEquals(result, fizzBuzz.fizzBuzz(number));
    }
}
