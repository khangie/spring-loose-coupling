package com.seleniumexpress.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {

        // Using interface Cheat which can be implemented using MathCheat and ScienceCheat
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("beans.xml file loaded");
        Student student2 = context.getBean("student", Student.class);
        student2.cheating();

    }

}
