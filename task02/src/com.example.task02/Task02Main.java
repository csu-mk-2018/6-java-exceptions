package com.example.task02;

import java.lang.Throwable;

public class Task02Main {

    public static void main(String[] args) {
        System.out.println(getSeason(-5));
    }

    static String getSeason(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            throw new IllegalArgumentException("monthNumber " + monthNumber + " is invalid, month number should be between 1..12");
        }
        if (monthNumber == 12 || monthNumber <= 2) {
            return "зима";
        } else if (monthNumber <= 5) {
            return "весна";
        } else if (monthNumber <= 8) {
            return "лето";
        } else {
            return "осень";
        }
    }
}