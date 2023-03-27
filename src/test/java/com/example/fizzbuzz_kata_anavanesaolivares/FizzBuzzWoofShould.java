package com.example.fizzbuzz_kata_anavanesaolivares;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzWoofShould {

    /*  3-Fizz
     *  5-Buzz
     *  7-Woof
     *  3-Fizz Fizz
     */

    @Test
    public void print_fizz_when_it_is_divisible_and_contains_three() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String number = fizzBuzz.convertNumbersToWord(3);
        Assertions.assertEquals("Fizz", number);
    }
}
