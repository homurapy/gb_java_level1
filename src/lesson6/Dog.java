package lesson6;

public class Dog extends Animals{

    public Dog (String name, String color, int age) {
        super(name, color, age);
        this.maxDistanceRun = 600;
        this.maxHeightJump = (float) 0.5;
        this.maxDistanceSwim = 10;
    }
}
