package com.example.spring.scheduled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;

import java.util.Random;

@EnableScheduling
public class SendMessageAllUsers {
    private Logger logger = LoggerFactory.getLogger(SendMessageAllUsers.class);

    public void sendMessage() {
        for (int i = 0; i < 100; i++) {
            logger.info(getName() + " " + "i = " + i + " Second");
        }
    }


    @Scheduled(cron = "*/2 * * * * ?")
    public String getName() {
        String str = "asdfghjklmnbvcxzqwertyuiop";
        Random random = new Random();
        String name = "";
        int size = random.nextInt(8);
        for (int i = 0; i < size; i++) {
            name += str.charAt(random.nextInt(str.length()));
        }
        return name;
    }
}
