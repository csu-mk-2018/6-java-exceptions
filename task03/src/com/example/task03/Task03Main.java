package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        try {
            throwCheckedException();
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ex");
        }

    }

    //todo напишите здесь свою корректную реализацию задания
    public static void throwCheckedException() throws Exception {
        throw new Exception("exception");
    }
}