package model;

import interfaces.Browser;
import interfaces.MusicPlayer;
import interfaces.PhoneDevice;

import java.util.Scanner;

public class Iphone implements MusicPlayer, PhoneDevice, Browser {
    private static String currentMusic = "";


    // 🎵 MusicPlayer

    @Override
    public void play() {
        if (currentMusic.isEmpty()) {
            System.out.println("Select a music");
        }else {
            System.out.println("Playing "+ currentMusic);
        }
    }

    @Override
    public void pause() {
        System.out.println("Music paused");
    }

    @Override
    public void SelectMusic(String music) {
        currentMusic = music;
        System.out.println("Selected music:  "+currentMusic);
    }



    // 📞 PhoneDevice
    @Override
    public void call(String number) {
        System.out.println("Calling to "+number+"...");
    }

    @Override
    public void answer() {
        System.out.println("Accepting the call...");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Starting the voice mail...");
    }

    @Override
    public void showPage(String url) {
        System.out.println("Showing page: "+url);
    }

    @Override
    public void addNewPage() {
        System.out.println("New page added");
    }

    @Override
    public void updatePage() {
        System.out.println("Uptdating the page");
    }
}
