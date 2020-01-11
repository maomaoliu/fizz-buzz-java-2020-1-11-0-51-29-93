package com.thoughtworks;

class FizzBuzz {
    String fizzBuzz(int number) {
        String numberString = String.valueOf(number);
        if (numberString.contains("3") && !numberString.contains("5")) {
            return "Fizz";
        }

        String result = "";
        result = handleDividableNumber(number, result);
        return result.equals("") ? numberString : result;
    }

    private String handleDividableNumber(int number, String result) {
        if (number % 3 == 0) {
            result += "Fizz";
        }
        if (number % 5 == 0) {
            result += "Buzz";
        }
        if (number % 7 == 0) {
            result += "Whizz";
        }
        return result;
    }
}
