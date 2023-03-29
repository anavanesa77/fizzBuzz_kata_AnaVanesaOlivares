package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzWoofShould {

    @Test
    public void print_FizzFizz_when_the_number_is_three() {
        FizzBuzzWoof fizzBuzzWoof = new FizzBuzzWoof();
        String number = fizzBuzzWoof.convertNumbersToWord(3);
        Assertions.assertEquals("FizzFizz(3)", number);
    }

    @Test
    public void print_Fizz_if_contain_three(){
        FizzBuzzWoof fizzBuzzWoof = new FizzBuzzWoof();
        String number = fizzBuzzWoof.convertNumbersToWord(13);
        Assertions.assertEquals("Fizz(13)", number);
    }

    @Test
    public void print_FizzFizz_if_is_divisible_by_three(){
        FizzBuzzWoof fizzBuzzWoof = new FizzBuzzWoof();
        String number = fizzBuzzWoof.convertNumbersToWord(33);
        Assertions.assertEquals("FizzFizz(33)", number);
    }

    @Test
    public void print_BuzzBuzz_when_the_number_is_five() {
        FizzBuzzWoof fizzBuzzWoof = new FizzBuzzWoof();
        String number = fizzBuzzWoof.convertNumbersToWord(5);
        Assertions.assertEquals("BuzzBuzz(5)", number);
    }

    @Test
    public void print_FizzBuzz_if_contain_five(){
        FizzBuzzWoof fizzBuzzWoof = new FizzBuzzWoof();
        String number = fizzBuzzWoof.convertNumbersToWord(53);
        Assertions.assertEquals("FizzBuzz(53)", number);
    }

    @Test
    public void print_Buzz_if_is_divisible_by_five(){
        FizzBuzzWoof fizzBuzzWoof = new FizzBuzzWoof();
        String number = fizzBuzzWoof.convertNumbersToWord(40);
        Assertions.assertEquals("Buzz(40)", number);
    }

    @Test
    public void print_Woof_when_the_number_is_seven() {
        FizzBuzzWoof fizzBuzzWoof = new FizzBuzzWoof();
        String number = fizzBuzzWoof.convertNumbersToWord(17);
        Assertions.assertEquals("Woof(17)", number);
    }

    @Test
    public void print_Woof_if_contain_seven(){
        FizzBuzzWoof fizzBuzzWoof = new FizzBuzzWoof();
        String number = fizzBuzzWoof.convertNumbersToWord(17);
        Assertions.assertEquals("Woof(17)", number);
    }

    @Test
    public void print_WoofWoof_if_is_divisible_by_seven(){
        FizzBuzzWoof fizzBuzzWoof = new FizzBuzzWoof();
        String number = fizzBuzzWoof.convertNumbersToWord(77);
        Assertions.assertEquals("WoofWoof(77)", number);
    }
}
