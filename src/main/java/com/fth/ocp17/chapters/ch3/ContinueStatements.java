package com.fth.ocp17.chapters.ch3;

import java.util.ArrayList;
import java.util.List;

public class ContinueStatements {

    public static void main(String[] args) {
        Student student1 = new Student("Ali",30);
        Student student2 = new Student("Veli",17);
        Student student3 = new Student("FAtih",32);
        Student student4 = new Student("Ferhat",16);
        Student student5 = new Student("Ayse",36);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        List<Student> youngStudent = new ArrayList();

        PARENT_LOOP:for (Student student : studentList) {
            if (student.age > 18) {
                continue PARENT_LOOP;
            }

            youngStudent.add(student);
        }

        for (Student student : youngStudent) {
            System.out.println(student.name);
        }

    }
}

class Student {
    String name;
    Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
