package spring.example.ioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import spring.example.ioc.sources.*;
@Configuration
@PropertySource("classpath:myApp.properties")
public class Config {
    @Value("${CarOne.name}")
    public String name;
    @Bean
    @Scope("prototype")
    public CarOne carOne(){
        CarOne carOne1 = new CarOne();
        carOne1.setWheels(wheels());
        carOne1.setEngine(engine());
        carOne1.setGearBox(gearBox());
        carOne1.setBodyType(bodyType());
        return carOne1;
    }
    @Bean
    @Scope("prototype")
    public BodyType bodyType(){
        return new BodyType();
    }
    @Bean
    @Scope("prototype")
    public Wheels wheels(){
        return new Wheels();
    }
    @Bean
    @Scope("prototype")
    public GearBox gearBox(){
        return new GearBox();
    }
    @Bean
    @Scope("prototype")
    public Engine engine(){
        return new Engine();
    }
}
