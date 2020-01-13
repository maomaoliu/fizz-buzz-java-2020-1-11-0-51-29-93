package com.thoughtworks;

class FizzBuzz {
    String fizzBuzz(int number){
        if(satisfyFizzCondition(number)){
            return "Fizz";
        }
        String result = "";
        if(satisfyCombinedFizzCondition(number)){
            result += "Fizz";
        }
        if(satisfyCombinedBuzzCondition(number)){
            result += "Buzz";
        }
        if(satisfyCombinedWhizzCondition(number)){
            result += "Whizz";
        }
        return result.equals("") ? String.valueOf(number) : result;
    }

    private boolean satisfyFizzCondition(int number) {
        return isContains(number, "3") && (!isContains(number, "5") || isContains(number, "7"));
    }

    private boolean satisfyCombinedFizzCondition(int number) {
        return isDividableBy(number, 3) && (!isContains(number, "5") || isContains(number, "7"));
    }

    private boolean satisfyCombinedBuzzCondition(int number) {
        return !isContains(number, "7") && (isContains(number, "5") || isDividableBy(number, 5));
    }

    private boolean satisfyCombinedWhizzCondition(int number) {
        return isDividableBy(number, 7);
    }

    private boolean isDividableBy(int number, int divisor) {
        return number % divisor == 0;
    }

    private boolean isContains(int number, String subNumber) {
        return String.valueOf(number).contains(subNumber);
    }
}
