package ru.maxima;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Cat cat = context.getBean("catId", Cat.class);

        System.out.println(cat.getName());

        context.close();
    }
}
