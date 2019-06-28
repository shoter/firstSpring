package com.shoter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Aparajita
 */
public class SpringMain {

    public static void main(String[] args) {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:config/beans.xml");
        SpringSource obj = (SpringSource) context.getBean("welcomeMessage");
        System.out.println("Message: " + obj.getWelcomeMessage() + "" + obj.getProjectType());
    }
}

