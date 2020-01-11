package com.thoughtworks;

class FizzBuzz {
    String fizzBuzz(int number){
        String result = "";
        if(satisfyFizzCondition(number)){
            result += "Fizz";
        }
        if(satisfyBuzzCondition(number)){
            result += "Buzz";
        }
        if(satisfyWhizzCondition(number)){
            result += "Whizz";
        }
        return result.equals("") ? String.valueOf(number) : result;
    }

    private boolean satisfyFizzCondition(int number) {
        return (!isContains(number, "5") || isContains(number, "7")) && (isContains(number, "3") || number % 3 == 0);
    }

    private boolean satisfyBuzzCondition(int number) {
        return !isContains(number, "7") && (isContains(number, "5") || (!isContains(number, "3") && number % 5 == 0));
    }

    private boolean satisfyWhizzCondition(int number) {
        return (!isContains(number, "3") || (isContains(number, "5") && !isContains(number, "7"))) && number % 7 == 0;
    }

    private boolean isContains(int number, String string) {
        return String.valueOf(number).contains(string);
    }
}
