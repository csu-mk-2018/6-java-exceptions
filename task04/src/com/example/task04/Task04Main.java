package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        System.out.println(getSeason(-5));
    }

    static String getSeason(int monthNumber) {
        String season;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осень";
                break;
            default:
                throw new MyException("monthNumber " + monthNumber + " is invalid, month number should be between 1..12");
        }

        return season;//todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }
}