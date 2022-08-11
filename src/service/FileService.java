package service;
import model.Student;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileService {
    public static String[] read(String url) throws Exception{
        return Files.readAllLines(Paths.get(url)).toArray(new String[0]);
    }

    public static void write(String url, String text)throws Exception{
        Files.write(Paths.get(url), text.getBytes(),StandardOpenOption.APPEND);
    }

    public static void writeInFiles(Student[] arr) throws Exception {
        for (Student student : arr) {
            String text = student.toString();
            Files.write(Paths.get(student.getName() + ".txt"), text.getBytes(), StandardOpenOption.CREATE);
        }
    }
}