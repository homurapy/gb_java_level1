package Lesson5;

public class Person {
    private String name;
    private String position;
    private String email;
    private long phoneNumber;
    private int salary;
    private int age;

    public Person (String name, String position, String email, int phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public void info(){
        System.out.println("ФИО сотрудника: " + name);
        System.out.println("Должность: " + position);
        System.out.println("Почта: " + email);
        System.out.println("Контактный телефон: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

    public int getAge () {
        return age;
    }
}
