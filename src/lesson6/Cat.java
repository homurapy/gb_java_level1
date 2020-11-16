package lesson6;

public class Cat extends Animals {

    public Cat (String name, String color, int age) {
        super(name, color, age);
        this.maxDistanceRun = 200;
        this.maxDistanceSwim = (float) 0.0;
        this.maxHeightJump = 2;
    }

}
