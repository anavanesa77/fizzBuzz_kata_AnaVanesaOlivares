package com.example;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzWoof {

    public static void main(String[] args) {
        executable();
    }

    public static void executable() {
        List<String> listNumber = new ArrayList();
        for (int i = 1; i <= 100; i++) {
            listNumber.add(convertNumbersToWord(i));
        }
        System.out.println(listNumber);
    }

    public static String convertNumbersToWord(int number) {
        boolean multipleOfThree = number % 3 == 0;
        boolean multipleOfFive = number % 5 == 0;
        boolean multipleOfSeven = number % 7 == 0;
        String message = "";

        if (multipleOfThree) {
            message += "Fizz";
        }
        if (multipleOfFive) {
            message += "Buzz";
        }
        if (multipleOfSeven) {
            message += "Woof";
        }
        if (containThree(String.valueOf(number))) {
            message += "Fizz";
        }
        if (containFive(String.valueOf(number))) {
            message += "Buzz";
        }
        if (containSeven(String.valueOf(number))) {
            message += "Woof";
        }
        if (!multipleOfThree & !multipleOfFive & !multipleOfSeven & !containFive(String.valueOf(number)) & !containThree(String.valueOf(number)) & !containSeven(String.valueOf(number))) {
            return String.valueOf(number);
        }
        return message + ("(") + number + (")");

    }


    private static boolean containThree(String number) {
        boolean operation = number.contains("3");
        return operation;
    }

    private static boolean containFive(String number) {
        boolean operation = number.contains("5");
        return operation;
    }

    private static boolean containSeven(String number) {
        boolean operation = number.contains("7");
        return operation;
    }


}



