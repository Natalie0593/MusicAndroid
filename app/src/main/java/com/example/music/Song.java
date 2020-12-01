package com.example.music;

public class Song {

    private  String somgName,songUrl;

    public Song() {
    }

    public Song(String somgName, String songUrl) {
        this.somgName = somgName;
        this.songUrl = songUrl;
    }

    public String getSomgName() {
        return somgName;
    }

    public void setSomgName(String somgName) {
        this.somgName = somgName;
    }

    public String getSongUrl() {
        return songUrl;
    }

    public void setSongUrl(String songUrl) {
        this.songUrl = songUrl;
    }
}
