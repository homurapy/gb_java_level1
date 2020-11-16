package lesson6;

public class Main {
    public static void main(String[] args) {
        Cat cat1;
        cat1 = new Cat("Vasya", "grey", 2);
        cat1.run(500);
Dog dog1 = new Dog("Bob", "white", 1);
        dog1.swim(3);
        Dog dogRex  = new SmallDog("Rex", "Black", 3);
        dogRex.info();
        dog1.info();
    }
}
