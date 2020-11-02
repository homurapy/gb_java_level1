import java.lang.reflect.Array;
import java.util.Arrays;

public class lesson2 {
    public static void main (String[] args) {


    }

    public static void invertArray () {//замена элементов массива с 0 на 1, 1 на 0;
        int[] arr = {1, 0, 0, 1, 0, 1, 1, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillToArray () {//заполнение массива значениями 0 3 6 9 12 15 18 21
        int[] arr = new int[8];
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
            a = a+3;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void changeArrayLess6 () {//умножение на 2 элементов массива  меньше 6
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]< 6) arr[i] = arr[i]*2;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void fillDiagonal () {//заполнение диагонали 1
        int[][]arr = new int[5][5];
        for(int i =0; i < arr.length; i++) {
            arr[i][arr.length-1-i] = 1;
            arr[i][i] = 1;
        }
        System.out.println(Arrays.deepToString(arr));
    }
    public static void findMinMax () {//нахождение мин и макс значения массива
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int amin = 2147483647;
        int amax = -2147483648;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= amin) amin = arr[i] ;
            if (arr[i] >= amax) amax = arr[i] ;
        }
        System.out.println("Минимальное значение элемента в массиве "+amin);
        System.out.println("Максимальное значение элемента в массиве "+amax);
    }
     static boolean checkBalance (int[] arr) {//равенство левой и правой частей массива
        int sumleft = 0;
        int sumRight = 0;
        int countR = 0;
        int countL = 0;
        for (int i = 0; i < arr.length; i++) {
               if (countL!= arr.length-countR){
                   if (sumleft <= sumRight) {
                    sumleft += arr[countL];
                    countL +=1;
                }
                else{
                       sumRight += arr[arr.length-1-countR];
                       countR +=1;
                   };
            }
        }
       return (sumleft == sumRight);
    }
    static void shiftMas (int[] arr,int n) {//сдвиг на n

        for(int j = 0; j < Math.abs(n); j++){
            if(n < 0) {
            int lastElement = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];}
        arr[arr.length-1] = lastElement;
        }
            else {
                int beginElement = arr[arr.length-1];
                for (int i = arr.length-1; i > 0; i--) {
                    arr[i] = arr[i-1];}
                arr[0] = beginElement;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}