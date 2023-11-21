package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}*/

public class Application {

	public static void testSpring() {
		/*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		*//*TestBean testBean = context.getBean("testBean", TestBean.class);
//		testBean.setName("Vladimir");
		System.out.println(testBean);*//*

		TestBean testBean1 = context.getBean("testBean", TestBean.class);
		TestBean testBean2 = context.getBean("testBean", TestBean.class);

//		testBean2.setName("555");
		context.close();
		System.out.println(testBean1);
		System.out.println(testBean2);
		System.out.println("Test");*/
	}
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		MusicPlayer musicPlayer = context.getBean("MusicPlayer", MusicPlayer.class);
		System.out.println(musicPlayer);

		/*TestBean testBean1 = context.getBean("testBean1", TestBean.class);
		TestBean testBean2 = context.getBean("testBean2", TestBean.class);
		System.out.println(testBean1);
		System.out.println(testBean2);
		context.close();*/

		/*System.out.println("Start app");
		testSpring();
		System.out.println("End app");*/
	}
}
