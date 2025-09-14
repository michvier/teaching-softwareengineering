package com.example.facade;

public class DvdPlayer {
    public void on() { System.out.println("DVD Player eingeschaltet"); }
    public void play(String movie) { System.out.println("Film starten: " + movie); }
    public void off() { System.out.println("DVD Player ausgeschaltet"); }
}