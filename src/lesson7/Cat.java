package lesson7;

public class Cat {
    private String name ;
    private int appetit;
    private boolean satiety;

    public Cat (String name, int appetit){
        this.name = name;
        this.appetit = appetit;
        satiety = false;
    }

    public void setSatiety (boolean satiety) {
        this.satiety = satiety;
    }
    public void eat (Plate plate){ plate.decreaseFood(appetit);}

    public int getAppetit () {
        return appetit;
    }

    public String getName () {
        return name;
    }

    public boolean isSatiety () {
        return satiety;
    }
}
