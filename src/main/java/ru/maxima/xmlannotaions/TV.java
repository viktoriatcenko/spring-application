package ru.maxima.xmlannotaions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

interface Channel {
    void playProgram();
}

@Component
class MTVChannel implements Channel {
    @Override
    public void playProgram() {
        System.out.println("You can watch music clip of Britney Spears");
    }
}

@Component
class NewsChannel implements Channel {
    @Override
    public void playProgram() {
        System.out.println("You can watch news show");
    }
}

@Component
public class TV {
    private final Channel channel1;
    private final Channel channel2;

    // <constructor-arg ref="newsChannel"/>
    @Autowired
    public TV(@Qualifier("newsChannel") Channel channel1,
              @Qualifier("MTVChannel") Channel channel2) {
        this.channel1 = channel1;
        this.channel2 = channel2;
    }


    public void playTV() {
        channel1.playProgram();
        channel2.playProgram();
    }
}
