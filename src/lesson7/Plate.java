package lesson7;

public class Plate {
    private int food;
    private int dose;
    public Plate (int food){
    this.food = food;
    dose = food;
    }
    public void info(){
        System.out.println("plate: " + food);
    }
    public void decreaseFood(int volume){
        food -= volume;
    }
    public void setFood (int food) { this.food = food;
    }
    public void putFood(int needfood, int remains){
        if(needfood > dose) food = dose;
        else {
            food = needfood;
        }
    }
    public int getFood () {
        return food;
    }
}
