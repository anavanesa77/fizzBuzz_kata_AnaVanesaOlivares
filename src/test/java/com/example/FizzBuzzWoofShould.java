package com.example;

import com.example.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzWoofShould {

    /*  3-Fizz
     *  5-Buzz
     *  7-Woof
     *  3-Fizz Fizz
     */

    @Test
    public void print_fizz_when_it_is_divisible_and_contains_three() {
        FizzBuzzWoof fizzBuzzWoof = new FizzBuzzWoof();
        String number = fizzBuzzWoof.convertNumbersToWord(3);
        Assertions.assertEquals("Fizz", number);
    }
}
