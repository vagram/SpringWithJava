package spring.example.ioc.sources;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.example.ioc.Config;


public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        CarOne carOne = context.getBean("carOne",CarOne.class);
        CarOne carOne1 = context.getBean("carOne",CarOne.class);
        carOne1.setName("VW");
        carOne1.getEngine().setVolume(4.5);
        carOne1.getGearBox().setMt("AT");
        carOne1.getBodyType().setBodyType("TRUCK");


        System.out.println(carOne);
        System.out.println(carOne1);
        context.close();
    }
}
