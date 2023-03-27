package com.example;

import com.example.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class fizzBuzzShould {

    /*  1-1
     *  3-fizz
     *  5-buzz
     *  15-fizzBuzz
     *  35
     */

    @Test
    public void print_same_number_when_it_is_not_divisible_by_three_and_five() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String number = fizzBuzz.convertNumbersToWord(2);
        Assertions.assertEquals("2", number);
    }

    @Test
    public void print_fizz_when_it_is_divisible_by_three() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String number = fizzBuzz.convertNumbersToWord(3);
        Assertions.assertEquals("fizz", number);
    }

    @Test
    public void print_buzz_when_it_is_divisible_by_five() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String number = fizzBuzz.convertNumbersToWord(5);
        Assertions.assertEquals("buzz", number);
    }

    @Test
    public void print_fizzBuzz_when_it_is_divisible_by_three_and_five() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String number = fizzBuzz.convertNumbersToWord(15);
        Assertions.assertEquals("fizzBuzz", number);
    }

    @Test
    public void print_fizz_if_it_contains_three_and_buzz_if_it_contains_five() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String number = fizzBuzz.convertNumbersToWord(13);
        Assertions.assertEquals("fizz", number);
    }

    @Test
    public void print_fizz_if_it_contain_zero() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String number = fizzBuzz.convertNumbersToWord(0);
        Assertions.assertEquals("fizzBuzz", number);
    }
}