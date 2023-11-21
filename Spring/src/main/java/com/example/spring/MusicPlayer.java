package com.example.spring;

import java.util.List;

public class MusicPlayer {
    private Music music;
    private List<Music> musicList;
    private String name;
    private int volume;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(100);
        for (Music m : musicList) {
            stringBuilder.append(m.getSong() + "\n");
        }
        return "Player: " + name + ", volume: " + volume + ", song: " + this.music.getSong() + "\nList: \n" + stringBuilder.toString();
    }
}
