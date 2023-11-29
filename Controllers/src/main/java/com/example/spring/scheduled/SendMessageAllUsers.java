package com.example.spring.scheduled;

import com.example.spring.controllers.HomeController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;

import java.util.Random;

@Configuration
@EnableScheduling
public class SendMessageAllUsers {
    private Logger logger = LoggerFactory.getLogger(HomeController.class);

    //18:00 - 19:59   18:19 , 18,38  1955

    @Scheduled(cron = "0 0/19 18-19 * * ?")
    public void sendMessage() {
        for (int i = 0; i < 100; i++) {
            logger.info(getName() + " " + "i = " + i + " Sended!!!");
        }
    }



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
