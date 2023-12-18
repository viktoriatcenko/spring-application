package ru.maxima.xmlannotaions;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.maxima.Cat;
import ru.maxima.SpringConfig;

public class TestTV {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        TV tv1 = context.getBean("TV", TV.class);
        TV tv2 = context.getBean("TV", TV.class);

        Cat cat = context.getBean("kitty", Cat.class);

        System.out.println(cat);

        System.out.println(tv1.equals(tv2));

        System.out.println(tv1.getName());
        System.out.println(tv1.getCountOfChannels());

        tv1.playTV();
    }
}
