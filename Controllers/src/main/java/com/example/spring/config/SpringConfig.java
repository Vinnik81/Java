package com.example.spring.config;

import com.example.spring.Music;
import com.example.spring.MusicPlayer;
import com.example.spring.TestBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(value = "com.example.spring")
@PropertySource("application.properties")
public class SpringConfig {
    @Bean
    @Scope(value = "prototype")

    public TestBean testBean2() {
        return new TestBean("Ivan");
    }

@Bean
    public MusicPlayer musicPlayer2(@Qualifier(value = "classicMusic") Music music) {
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.setName("HP");
        musicPlayer.setVolume(100);
        return musicPlayer;
    }

}
