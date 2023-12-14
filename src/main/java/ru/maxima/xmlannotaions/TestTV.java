package ru.maxima.xmlannotaions;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTV {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        TV tv = context.getBean("TV", TV.class);

        tv.playTV();
    }
}
