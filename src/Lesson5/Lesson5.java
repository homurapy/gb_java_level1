package Lesson5;

public class Lesson5 {
    public static void main (String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иванов Иван Иванович ", "инженер", "ivanov_II@mycompany.com", 7453123, 70000, 36);
        persArray[1] = new Person("Петров Петр Петрович", "стажер", "petrov_PP@mycompany.com", 4561237, 25000, 23);
        persArray[2] = new Person("Меркулова Агнесса Михайловна", "уборщица", "merculova_AM@mycompany.com", 1234567, 35000, 48);
        persArray[3] = new Person("Васнецов Игнат Матвеевич", "главный специалист", "vasnetsov_IM@mycompany.com", 4567891, 84000, 58);
        persArray[4] = new Person("Ларионов Аркадий Викторович", "водитель", "larionov_AV@mycompany.com", 4567891, 60000, 37);
               for (int i=0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) persArray[i].info();
        }
    }
}