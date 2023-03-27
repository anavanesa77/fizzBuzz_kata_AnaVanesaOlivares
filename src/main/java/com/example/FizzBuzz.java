package com.example;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

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

        if (multipleOfNumber(number)) {
            return "fizzBuzz";
        }
        if (!(multipleOfNumber(number)) & containZero(String.valueOf(number))){
            return "fizzBuzz";
        }
        if (containThree(String.valueOf(number)) || multipleOfThree(number)) {
            return "fizz";
        }
        if (containFive(String.valueOf((number))) || multipleOfFive(number)) {
            return "buzz";
        }

        return String.valueOf(number);
    }


    private static boolean multipleOfThree(int number) {
        boolean operation = number % 3 == 0;
        return operation;
    }

    private static boolean multipleOfFive(int number) {
        boolean operation = number % 5 == 0;
        return operation;
    }

    private static boolean containThree(String number) {
        boolean operation = number.contains("3");
        return operation;
    }

    private static boolean containFive(String number) {
        boolean operation = number.contains("5");
        return operation;
    }

    private static boolean containZero(String number) {
        boolean operation = number.contains("0");
        return operation;
    }

    private static boolean multipleOfNumber(int number){
        boolean operation = (multipleOfFive(number) & multipleOfThree(number));
        return operation;
    }

}



