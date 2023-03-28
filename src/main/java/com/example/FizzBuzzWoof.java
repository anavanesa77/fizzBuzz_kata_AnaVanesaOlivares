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

        if (containThree(String.valueOf(number))) {
            message += "Fizz";
        }
        if (!containThree(String.valueOf(number))) {
            return String.valueOf(number);
        }
        return message + ("(") + number + (")");

    }

    private static boolean containThree(String number) {
        boolean operation = number.contains("3");
        return operation;
    }

}

