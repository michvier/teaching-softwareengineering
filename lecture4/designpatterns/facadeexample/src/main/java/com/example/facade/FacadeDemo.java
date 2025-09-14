package com.example.facade;

public class FacadeDemo {
    public static void main(String[] args) {
        DvdPlayer dvd = new DvdPlayer();
        Projector projector = new Projector();
        SoundSystem sound = new SoundSystem();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, projector, sound);

        homeTheater.watchMovie("Der Herr der Ringe");
        System.out.println();
        homeTheater.endMovie();
    }
}