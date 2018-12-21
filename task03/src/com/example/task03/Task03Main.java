package com.example.task03;
import java.io.FileReader;
import java.io.IOException;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        throwCheckedException();

    }

    //todo напишите здесь свою корректную реализацию задания
    public static void throwCheckedException() throws IOException {
        //Попытка прочитать несуществующий файл (IOException);
        try(FileReader reader = new FileReader("NonExistentFile.txt"))
        {
            //действия с файлом
        }
        catch(IOException ex){
            throw new IOException(ex.getMessage());
        }
    }
}