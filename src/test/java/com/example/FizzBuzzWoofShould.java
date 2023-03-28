package com.example;

import com.example.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzWoofShould {

    /*  3(igual, contener, divisible)->Fizz
     *  5(igual, contener, divisible)->Buzz
     *  7(igual, contener, divisible)->Woof
     *  33(contiene, divisible)->FizzFizz
     */

    @Test
    public void print_fizz_when_the_number_is_same() {
        FizzBuzzWoof fizzBuzzWoof = new FizzBuzzWoof();
        String number = fizzBuzzWoof.convertNumbersToWord(3);
        Assertions.assertEquals("Fizz(3)", number);
    }

    @Test
    public void (){
        FizzBuzzWoof fizzBuzzWoof = new FizzBuzzWoof();
        String number = fizzBuzzWoof.convertNumbersToWord(53);
        Assertions.assertEquals("FizzFizz(53)", number);

    }
}
