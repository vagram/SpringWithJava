package spring.example.ioc.sources;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GearBox {
    public String mt = "MT";
    public int steps = 7;
}
