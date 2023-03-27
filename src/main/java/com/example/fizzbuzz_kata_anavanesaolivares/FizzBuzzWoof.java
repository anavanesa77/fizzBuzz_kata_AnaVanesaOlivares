package com.example.fizzbuzz_kata_anavanesaolivares;

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
        return String.valueOf(0);
    }
}


