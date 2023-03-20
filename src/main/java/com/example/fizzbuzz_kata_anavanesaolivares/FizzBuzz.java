package com.example.fizzbuzz_kata_anavanesaolivares;


public class FizzBuzz {

    public static void main(String[] args) {

    }

    public String execute(int number) {
        String fizz = "fizz";
        String buzz = "buzz";
        String fizzBuzz = "fizzBuzz";

        if ((number % 3 == 0) & (number % 5 == 0 )) {
                return fizzBuzz;
        } else if (number % 3 == 0) {
                return fizz;
        } else if (number % 5 == 0) {
            return buzz;
        } else {
            return String.valueOf(number);
        }
    }
    }

