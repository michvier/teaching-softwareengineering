package com.example.facade;

public class HomeTheaterFacade {
    private final DvdPlayer dvd;
    private final Projector projector;
    private final SoundSystem sound;

    public HomeTheaterFacade(DvdPlayer dvd, Projector projector, SoundSystem sound) {
        this.dvd = dvd;
        this.projector = projector;
        this.sound = sound;
    }

    public void watchMovie(String movie) {
        System.out.println(">>> Vorbereitung zum Filme schauen...");
        projector.on();
        projector.wideScreenMode();
        sound.on();
        sound.setVolume(10);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println(">>> Film beenden...");
        dvd.off();
        sound.off();
        projector.off();
    }
}