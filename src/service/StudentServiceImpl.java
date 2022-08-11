package service;

import model.Student;

public class StudentServiceImpl implements StudentService{
    @Override
    public Student[] convert(String[] output) {
        Student[] students = new Student[output.length];
        for (int i = 0; i < output.length; i++) {
            String esiminch = output[i];
            Student student = new Student(esiminch);
            students[i] = student;
        }
        return students;
    }

    @Override
    public String maxStudent(Student[] arr) {
        Student max = arr[0];
        for (Student el : arr) {
            if (el.getAge() < max.getAge()){
                max = el;
            }
        }
        return max.toString();
    }
}
