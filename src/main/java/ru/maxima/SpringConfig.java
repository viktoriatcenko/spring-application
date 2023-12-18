package ru.maxima;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.maxima")
@PropertySource("classpath:tv.properties")
public class SpringConfig {

    @Bean
    public Cat kitty() {
        return new Cat();
    }
}
