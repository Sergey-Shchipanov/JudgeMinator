package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author anshipanov
 */
public class Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        context.registerShutdownHook();
    }
}