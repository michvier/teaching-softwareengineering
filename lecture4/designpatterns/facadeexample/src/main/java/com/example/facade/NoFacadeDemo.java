package com.example.facade;

public class NoFacadeDemo {
    public static void main(String[] args) {
        DvdPlayer dvd = new DvdPlayer();
        Projector projector = new Projector();
        SoundSystem sound = new SoundSystem();

        System.out.println(">>> Vorbereitung zum Filme schauen...");
        projector.on();
        projector.wideScreenMode();
        sound.on();
        sound.setVolume(10);
        dvd.on();
        dvd.play("Der Herr der Ringe");

        System.out.println();

        System.out.println(">>> Film beenden...");
        dvd.off();
        sound.off();
        projector.off();
    }
}