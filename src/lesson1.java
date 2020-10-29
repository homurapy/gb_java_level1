public class lesson1 {
    public static void main (String[] args) {
        byte perem1;
        short perem2;
        int perem3;
        long perem4;
        float perem5;
        double perem6;
        boolean perem7;
        char perem8;
        perem1 = 100;
        perem2 = 12123;
        perem3 = 123323;
        perem4 = 123612723;
        perem5 = 1.32f;
        perem6 = 1.34234;
        perem7 = true;
        perem8 = 'c';
boolean c = minuspolus(4);
        System.out.println(c);
    }

    static float metod1 (float a, float b, float c, float d) {// вычисление алгебраического выражения a * (b + (c / d
        return (a * (b + (c / d)));
    }

    static boolean check10_20 (int a, int b) { //определение нахождения размера суммы 2-х чисел  в промежутке от 10 до 20 включительно
        boolean rez = a + b > 10 && a + b <= 20;
        return rez;
    }

    static void polus (int a) { // определение знака числа
        if (a < 0) System.out.println(a + "- отрицательное число");
        else {System.out.println(a + "- положительное число");
        }
    }
    static boolean minuspolus (int a) //  определение отрицательного числа
    {
        boolean rez = a < 0;
        return rez;
                  }
    static void helloAnithing (String name ) { //приветствие незнакомца
       System.out.println("«Привет, "+name+"!»");
    }
    static void visYear(int year){ // определение вискосный год ли
        if (year%4 == 0 && year%100 != 0 || year% 400 == 0)  System.out.println(year +" - високосный год");
    }
}
