package com.example.task03;
import java.lang.Exception;

public class Task03Main {
    public static void main(String[] args) throws Exception {
        throwCheckedException();
    }

    public static void throwCheckedException() throws Exception{
        throw new Exception("My Exception");
    }
}