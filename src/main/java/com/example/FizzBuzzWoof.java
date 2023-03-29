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

    public static String convertNumbersToWord(int chainNumber) {
        String message = "";

        if (calculateMultiple(chainNumber, 3)) {
            message += "Fizz";
        }
        if (calculateMultiple(chainNumber, 5)) {
            message += "Buzz";
        }
        if (calculateMultiple(chainNumber, 7)) {
            message += "Woof";
        }
        if (containNumber(String.valueOf(chainNumber), String.valueOf(3))) {
            message += "Fizz";
        }
        if (containNumber(String.valueOf(chainNumber), String.valueOf(5))) {
            message += "Buzz";
        }
        if (containNumber(String.valueOf(chainNumber), String.valueOf(7))) {
            message += "Woof";
        }
        return message + ("(") + chainNumber + (")");
    }

    private static boolean calculateMultiple(int chainNumber, int multipleNumber) {
        boolean multipleOfNumber = chainNumber % multipleNumber == 0;
        return multipleOfNumber;
    }

    private static boolean containNumber(String chainNumber, String containsThisNumber) {
        boolean operation = chainNumber.contains(containsThisNumber);
        return operation;
    }

}



