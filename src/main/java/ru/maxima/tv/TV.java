package ru.maxima.tv;

interface Channel {
    void playProgram();
}

class MTVChannel implements Channel {
    @Override
    public void playProgram() {
        System.out.println("You can watch music clip of Britney Spears");
    }
}

class NewsChannel implements Channel {
    @Override
    public void playProgram() {
        System.out.println("You can watch news show");
    }
}

public class TV {
    private Channel channel;

    public TV(Channel channel) {
        this.channel = channel;
    }

    public void playTV() {
        channel.playProgram();
    }
}
