package lesson6;

public class SmallDog extends Dog {
    public SmallDog (String name, String color, int age) {
        super(name,color,age);
        this.maxDistanceRun = 500;
    }
}
