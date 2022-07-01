package spring.example.ioc.sources;
public class Wheels {
    private int wheels = 4;

    public Wheels() {
    }

    public Wheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "wheels=" + wheels +
                '}';
    }
}
