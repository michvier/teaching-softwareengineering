package com.example.facade;

public class SoundSystem {
    public void on() { System.out.println("Soundsystem eingeschaltet"); }
    public void setVolume(int level) { System.out.println("Lautstärke auf " + level); }
    public void off() { System.out.println("Soundsystem ausgeschaltet"); }
}