package com.spring;

public class Employee implements  User{
    public Employee() {
        System.out.println("Employee constructor");
    }

    @Override
    public void info() {
        System.out.println("Employee info");
    }
}
