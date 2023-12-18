package ru.maxima.xmlannotaions;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTV {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        TV tv1 = context.getBean("TV", TV.class);
        TV tv2 = context.getBean("TV", TV.class);

        System.out.println(tv1.equals(tv2));

        System.out.println(tv1.getName());
        System.out.println(tv1.getCountOfChannels());

        tv1.playTV();
    }
}
