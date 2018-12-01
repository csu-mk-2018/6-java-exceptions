package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(getSeason(1));

    }

    static String getSeason(int monthNumber) {

        if (monthNumber < 1 || monthNumber > 12) {
            throw new IllegalArgumentException(String.format("monthNumber %d is invalid, month number should be between 1..12", monthNumber));
        }

        String resultSeason;

        if ((monthNumber < 3) || monthNumber == 12)
            resultSeason = "зима";
        else if (monthNumber < 6)
            resultSeason = "весна";
        else if (monthNumber < 9)
            resultSeason = "лето";
        else
            resultSeason = "осень";

        return resultSeason;
    }
}