package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope(scopeName = "prototype")
public class MusicPlayer {
    private Music music;
    private List<Music> musicList;
    private String name;
    private int volume;

    @Autowired
    public MusicPlayer(@Qualifier(value = "rockMusic") Music music) {
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

    @Value(value = "${musicPlayer.name}")
    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    @Value(value = "${musicPlayer.value}")
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
        /*for (Music m : musicList) {
            stringBuilder.append(m.getSong() + "\n");
        }*/
        return "Player: " + name + ", volume: " + volume  + "\nList: \n" + stringBuilder.toString();
    }
}
