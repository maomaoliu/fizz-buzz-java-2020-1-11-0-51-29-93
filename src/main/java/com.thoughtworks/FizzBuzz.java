package com.thoughtworks;

class FizzBuzz {
    String fizzBuzz(int number) {
        String numberString = String.valueOf(number);
        if (numberString.contains("3") && !numberString.contains("5")) {
            return "Fizz";
        }
        if (numberString.contains("5") && !numberString.contains("7")) {
            String result = "Buzz";
            result += getAddOnIfDividableBy7(number);
            return result;
        }
        if (numberString.contains("7")) {
            if (numberString.contains("3")) {
                return "Fizz";
            }
            String result = "";
            result += getAddOnIfDividableBy3(number);
            result += getAddOnIfDividableBy7(number);
            return result.equals("") ? numberString : result;
        }

        String result = "";
        result = handleDividableNumber(number, result);
        return result.equals("") ? numberString : result;
    }

    private String handleDividableNumber(int number, String result) {
        result += getAddOnIfDividableBy3(number);
        result += getAddOnIfDividableBy5(number);
        result += getAddOnIfDividableBy7(number);
        return result;
    }

    private String getAddOnIfDividableBy3(int number) {
        return number % 3 == 0 ? "Fizz" : "";
    }

    private String getAddOnIfDividableBy5(int number) {
        return number % 5 == 0 ? "Buzz" : "";
    }

    private String getAddOnIfDividableBy7(int number) {
        return number % 7 == 0 ? "Whizz" : "";
    }
}
