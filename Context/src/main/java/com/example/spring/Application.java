package com.example.spring;

import com.example.spring.config.SpringConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}*/

public class Application {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		MusicPlayer musicPlayer = context.getBean("musicPlayer2", MusicPlayer.class);
		System.out.println(musicPlayer);
		TestBean testBean = context.getBean("testBean2", TestBean.class);
		System.out.println(testBean);

		/*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		System.out.println(musicPlayer);*/
		/*TestBean testBean1 = context.getBean("testBean", TestBean.class);
		TestBean testBean2 = context.getBean("testBean", TestBean.class);

		testBean1.setName("Vladimir");

		System.out.println(testBean1);
		System.out.println(testBean2);*/

	}
}
