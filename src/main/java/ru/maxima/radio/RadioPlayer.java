package ru.maxima.radio;

import lombok.Data;

interface Music {
    void playSong();
}

class RadioMaximum  implements Music {
    private String song;

    public RadioMaximum(String song) {
        this.song = song;
    }

    @Override
    public void playSong() {
        System.out.println(song);
    }
}

class RadioEnergy implements Music {
    private String song;

    public RadioEnergy(String song) {
        this.song = song;
    }

    // = "Bruno Mars - Uptown Funk"
    @Override
    public void playSong() {
        System.out.println(song);
    }
}

@Data
public class RadioPlayer {
    private Music music;
    private String nameOfPlayer;
    private int volume;

    public void init() {
        System.out.println("Here our bean already waiting for us");
    }

    public void destroy() {
        System.out.println("Here our bean will be destroyed");
        System.out.println("Here our bean will be destroyed");
        System.out.println("Here our bean will be destroyed");
        System.out.println("Here our bean will be destroyed");
    }

//    public RadioPlayer(Music music) {
//        this.music = music;
//    }


//    public void configureMusic(Music music) {
//        this.music = music;
//    }

    public void playRadio() {
        System.out.println("Now is playing ..");
        music.playSong();
    }
}
