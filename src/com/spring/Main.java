package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.print("Enter the pin: ");
        int pin = scanner.nextInt();
        scanner.close();
        User user;
        if (pin == 1010) {
            System.out.println("Valid pin");
            user = (Student) context.getBean("student");
            user.info();
        } else {
            System.err.println("Invalid pin");
            user = (Employee) context.getBean("employee");
            user.info();

            user = (Manager) context.getBean("manager");
            user.info();
        }
    }
}
