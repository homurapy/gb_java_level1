package lesson7;

public class Lesson7 {

    public static void main (String[] args) {
        Cat[] catsArray = new Cat[5];
        catsArray[0] = new Cat("Васька", 6);
        catsArray[1] = new Cat("Мурка", 9);
        catsArray[2] = new Cat("Петр", 7);
        catsArray[3] = new Cat("Барсик", 9);
        catsArray[4] = new Cat("Машка", 12);
        Plate plate = new Plate(20);
while(groupOfCatsSatiety(catsArray) == false) {
    int needfood = 0;
    int remains;
    for (int cat = 0; cat < catsArray.length; cat++) {
        if ((catsArray[cat].getAppetit() <= plate.getFood()) && (catsArray[cat].isSatiety() == false) ) {
            catsArray[cat].eat(plate);
            catsArray[cat].setSatiety(true);
            System.out.println(catsArray[cat].getName() + " поел " + catsArray[cat].isSatiety());
        }
        else if ((catsArray[cat].getAppetit() > plate.getFood()) && (catsArray[cat].isSatiety() == false)){
            needfood += catsArray[cat].getAppetit();
        }
    }
    if (groupOfCatsSatiety(catsArray) == false) {
        remains = plate.getFood();
        //System.out.println("Осталось в тарелке " + remains);
        plate.putFood(needfood,remains);
        System.out.println("Есть еще голодные коты");
        System.out.println("Добавлено в тарелку " + (plate.getFood()-remains));
        }
    }
    }
    public static boolean groupOfCatsSatiety(Cat []array) {
        boolean satisfaction = true;
        for (int cat = 0; cat < array.length; cat++) {
            if (array[cat].isSatiety() == false) {
                satisfaction = false;
            }
         }
        return satisfaction;
    }
}
