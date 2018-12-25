package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(-5));
         */
    }

    static String getSeason(int numMonth) {
        if (numMonth >=1 && numMonth <= 2 || numMonth == 12) {
            return "зима";
        }
        else if (numMonth >= 3 && numMonth <= 5) {
            return "весна";
        }
        else if (numMonth >= 6 && numMonth <= 8) {
            return "лето";
        }
        else if (numMonth >= 9 && numMonth <= 11) {
            return "осень";
        }

        else {
            throw new IllegalArgumentException("monthNumber " + numMonth +" is invalid, month number should be between 1..12");
        }
    }
}
