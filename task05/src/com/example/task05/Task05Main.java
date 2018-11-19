package com.example.task05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task05Main {
    public static void main(String[] args) {
        String pathToFile = args[0]; // "/home/user/file.txt"
        //String pathToFile = "/home/user/file.txt";
        String s = readFile(pathToFile);
        System.out.print(s);
    }

    public static String readFile(String pathToFile) {
        try {
            FileReader fileReader = new FileReader(pathToFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuilder stringBuilder = new StringBuilder();
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                stringBuilder.append(currentLine);
                stringBuilder.append("\n");
            }
            bufferedReader.close();
            return stringBuilder.toString();
        } catch (FileNotFoundException e) {
            return "файл \"" + pathToFile + "\" не найден\n";
        } catch (IOException e) {
            return "произошла ошибка при чтении файла \"" + pathToFile + "\"";
        }
    }
}