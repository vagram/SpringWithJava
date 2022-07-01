package spring.example.ioc.sources;

public class BodyType {
    private String bodyType = "sedan";

    public BodyType(){
    }

    public BodyType(String bodyType){
        this.bodyType = bodyType;
    }

    public String getBodyType(){
        return bodyType;
    }

    public void setBodyType(String bodyType){
        this.bodyType = bodyType;
    }

    @Override
    public String toString(){
        return "BodyType{" +
                "bodyType=" + bodyType +
                '}';
    }

}
