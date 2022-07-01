package spring.example.ioc.sources;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarOne {
    public Engine engine;
    public GearBox gearBox;
    public String name = "BMW";
    public Wheels wheels;
    public BodyType bodyType;

}
