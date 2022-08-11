package model;

public class Student {
    private String name;

    private String surName;

    private int age;

    private double mark;

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public Student(String esiminch) {
        String[] split = esiminch.split(",");
        name = split[0];
        surName = split[1];
        age = Integer.parseInt(split[2]);
        mark = Double.parseDouble(split[3]);
    }

    @Override public String toString() {
        return "Name: " + name + "," + "\n" + "Surname: " + surName + "," + "\n" + "Age: " + age + "," + "\n" + "Mark: " + mark + "," + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
