package ru.maxima.radio;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRadio {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        RadioPlayer radioPlayer1 = context.getBean("radioPlayer", RadioPlayer.class);
        RadioPlayer radioPlayer2 = context.getBean("radioPlayer", RadioPlayer.class);

        System.out.println(radioPlayer1);
        System.out.println(radioPlayer2);

        System.out.println(radioPlayer1.equals(radioPlayer2));

        System.out.println(radioPlayer2.getNameOfPlayer());
        System.out.println(radioPlayer2.getVolume());
        radioPlayer2.playRadio();
    }
}
