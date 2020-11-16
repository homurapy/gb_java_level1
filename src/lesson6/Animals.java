package lesson6;

public class Animals {
    protected String name;
    protected String color;
    protected int age;
    protected float maxDistanceRun;
    protected float maxHeightJump;
    protected float maxDistanceSwim;
    public  Animals (String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
        //this.maxDistanceRun = maxDistanceRun;
        //this.maxHeightJump = maxHeightJump;
        //this.maxDistanceSwim = maxDistanceSwim;
    }
    public void run(float distance) {
        if (maxDistanceRun == 0) {
        System.out.print("Animal " + name + " does not know how to run");}
        else if (maxDistanceRun < distance) {
            System.out.println((maxDistanceRun > distance) + " -> " + name + " run only " + maxDistanceRun + " m");
        }
        else {
            System.out.println( (maxDistanceRun > distance) +" -> " + name + " run: "+ distance + " m ");
        }
    }


    public void jump(float height){
        if (maxHeightJump == 0){
            System.out.print("Animal "+ name + " does not know how to jump");
        }
        else if ( maxHeightJump < height){
            System.out.println((maxDistanceRun > height) + " -> " + name +" jump only " + maxHeightJump+" m");
        }
        else {
            System.out.println((maxDistanceRun > height)  + " -> " + name + " jump "+ height +" m ");
        }
    }
    public void swim(float distance){
        if (maxDistanceSwim == 0){
            System.out.print("Animal " + name + " does not know how to swim");
        }
        else if (maxDistanceSwim < distance){
            System.out.println((maxDistanceSwim > distance) + " -> " + name +" swim only " + maxDistanceSwim+" m");
        }
        else {
            System.out.println((maxDistanceRun > distance) + " -> " + name + " swim " + distance +" m ");
        }
    }
    public void info(){
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Age: " + age);
        System.out.println("Maximum distance to run , m: " + maxDistanceRun);
        System.out.println("Height of the jump, m: " + maxHeightJump);
        System.out.println("Maximum swim distance, m: " + maxDistanceSwim);
    }
}
