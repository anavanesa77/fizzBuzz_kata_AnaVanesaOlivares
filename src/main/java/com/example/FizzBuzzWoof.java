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
        String message = "";

        if (checkIfIsMultiple(number, 3)) {
            message += "Fizz";
        }
        if (checkIfIsMultiple(number, 5)) {
            message += "Buzz";
        }
        if (checkIfIsMultiple(number, 7)) {
            message += "Woof";
        }
        final String numberAsText = String.valueOf(number);
        if (numberAsText.contains("3")){
            message += "Fizz";
        }
        if (numberAsText.contains("5")) {
            message += "Buzz";
        }
        if (numberAsText.contains("7")) {
            message += "Woof";
        }
        return "%s(%s)".formatted(message,numberAsText);
    }

    private static boolean checkIfIsMultiple(int chainNumber, int multipleNumber) {
        return chainNumber % multipleNumber == 0;
    }

}



