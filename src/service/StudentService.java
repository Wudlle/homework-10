package service;

import model.Student;

public interface StudentService {
    Student[] convert(String[] output);

    String maxStudent(Student[] arr);
}
