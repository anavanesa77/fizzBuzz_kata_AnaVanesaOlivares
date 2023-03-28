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

        if (containThree(String.valueOf(number)) || (multipleOfThree(number))) {
            return "Fizz" + " Fizz";
        }
        return String.valueOf(number);
    }


    private static boolean multipleOfThree(int number) {
        boolean operation = number % 3 == 0;
        return operation;
    }

    private static boolean containThree(String number) {
        boolean operation = number.contains("3");
        return operation;
    }
}

