package com.spring;

public class Student implements User{
    @Override
    public void info() {
        System.out.println("Student info");
    }

    public Student() {
        System.out.println("Student constructor");
    }
}
