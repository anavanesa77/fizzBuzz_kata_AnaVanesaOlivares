package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class fizzBuzzShould {

    @Test
    public void print_same_number_when_it_is_not_divisible_by_three_and_five() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String number = fizzBuzz.convertNumbersToWord(2);
        Assertions.assertEquals("2", number);
    }

    @Test
    public void print_Fizz_when_it_is_divisible_by_three() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String number = fizzBuzz.convertNumbersToWord(6);
        Assertions.assertEquals("Fizz(6)", number);
    }

    @Test
    public void print_Buzz_when_it_is_divisible_by_five() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String number = fizzBuzz.convertNumbersToWord(10);
        Assertions.assertEquals("Buzz(10)", number);
    }

    @Test
    public void print_Fizz_when_contain_three() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String number = fizzBuzz.convertNumbersToWord(13);
        Assertions.assertEquals("Fizz(13)", number);
    }

    @Test
    public void print_Buzz_when_contain_five() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String number = fizzBuzz.convertNumbersToWord(52);
        Assertions.assertEquals("Buzz(52)", number);
    }

}