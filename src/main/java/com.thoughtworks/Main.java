package com.thoughtworks;

public class Main {
    public static void main(String[] args){
        FizzBuzz fizzBuzz = new FizzBuzz();
        for( int i = 0; i < 100; i++) {
            String result = fizzBuzz.fizzBuzz(i+1);
            System.out.println(result);
        }
    }
}
