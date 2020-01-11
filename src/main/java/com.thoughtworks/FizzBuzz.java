package com.thoughtworks;

class FizzBuzz {
    String fizzBuzz(int number) {
        if (number % 3 == 0){
            return "Fizz";
        } else if (number % 5 == 0){
            return "Buzz";
        } else if (number % 7 == 0){
            return "Whizz";
        }

        return String.valueOf(number);
    }
}
