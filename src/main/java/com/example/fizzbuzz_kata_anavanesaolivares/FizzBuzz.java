package com.example.fizzbuzz_kata_anavanesaolivares;

public class FizzBuzz {

    public static void main(String[] args) {
        executable();
    }

    private static void executable(){
        for (int i = 0; i <= 100; i++) {
            System.out.println(execute(i));
        }
    }
    public static String execute(int number) {
        if ((number % 3 == 0) & (number % 5 == 0)) {
            return "fizzBuzz";
        }
        if (number % 3 == 0) {
            return "fizz";
        }
        if (number % 5 == 0) {
            return "buzz";
        }
        return String.valueOf(number);
    }
}
