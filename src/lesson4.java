import java.util.Random;
import java.util.Scanner;

public class lesson4 {
        static char[][] map;
        public static final int SIZE = 5;
        public static final int DOTS_TO_WIN = 4;
        public static final char DOT_EMPTY = '•';
        public static final char DOT_X = 'X';
        public static final char DOT_O = 'O';
    public static void main (String[] args){
            initMap();
            printMap();
            while (true) {
                humanTurn();
                printMap();
                if (checkWin(DOT_X)) {
                    System.out.println("Победил человек");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
                aiTurn();
                printMap();
                   if (checkWin(DOT_O)) {
                    System.out.println("Победил Искуственный Интеллект");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
            }
            System.out.println("Игра закончена");
        }

    //Инициализация поля
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    //Вывод поля в консоль
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
               System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    //Ход человека
    public static Scanner sc = new Scanner(System.in);
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }
    // Проверка ячеек
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }
    //Ход компьютера
    public static Random rand = new Random();
    public static void aiTurn() {
        int x, y;
        do {
                x = rand.nextInt(SIZE);
                y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
    static boolean checkWin(char symb) {
        int upLeftcntToDiagLeft = 0;
        int upLeftcntToDiagRight = 0;
        for (int i = 0; i < SIZE-1; i++) { //Проверка верхнего левого квадранта 4х4
            int countToVertical = 0;
            int countToHorizontal = 0;
                for (int j = 0; j < SIZE-1; j++) {
                    if (map[i][j] == symb) {countToHorizontal += 1;} //Проверка горизонтальных элементов
                    if (map[j][i] == symb) {countToVertical += 1; }// Проверка вертикальных элементов
                }
                if (map[i][i] == symb) { upLeftcntToDiagLeft += 1; }//Проверка диагонали левой
                if (map[i][SIZE - 2 - i] == symb) {upLeftcntToDiagRight += 1;}//Проверка диаганали правой
                if (countToHorizontal == DOTS_TO_WIN || countToVertical == DOTS_TO_WIN || upLeftcntToDiagLeft == DOTS_TO_WIN || upLeftcntToDiagRight == DOTS_TO_WIN) return true;
            }
        int upRightcntToDiagLeft = 0;
        int upRightcntToDiagRight = 0;
        for (int i = 0; i < SIZE-1; i++) {//Проверка верхнего правого квадранта 4х4
            int countToVertical = 0;
            int countToHorizontal = 0;
            for (int j = 0; j < SIZE-1; j++) {
                if (map[i][j+1] == symb) {countToHorizontal += 1;} //Проверка горизонтальных элементов
                if (map[j][i+1] == symb) {countToVertical += 1; }// Проверка вертикальных элементов
            }
            if (map[i][i+1] == symb) { upRightcntToDiagLeft += 1; }//Проверка диагонали левой
            if (map[i][SIZE - 1 - i] == symb) {upRightcntToDiagRight += 1;}//Проверка диаганали правой
            if (countToHorizontal == DOTS_TO_WIN || countToVertical == DOTS_TO_WIN || upRightcntToDiagLeft == DOTS_TO_WIN || upRightcntToDiagRight == DOTS_TO_WIN) return true;
        }
        int downLeftcntToDiagLeft = 0;
        int downLeftcntToDiagRight = 0;
        for (int i = 0; i < SIZE-1; i++) {//Проверка нижнего левого квадранта 4х4
            int countToVertical = 0;
            int countToHorizontal = 0;
            for (int j = 0; j < SIZE-1; j++) {
                if (map[i+1][j] == symb) {countToHorizontal += 1;} //Проверка горизонтальных элементов
                if (map[j+1][i] == symb) {countToVertical += 1; }// Проверка вертикальных элементов
            }
            if (map[i+1][i] == symb) { downLeftcntToDiagLeft += 1; }//Проверка диагонали левой
            if (map[i+1][SIZE - 2 - i] == symb) {downLeftcntToDiagRight += 1;}//Проверка диаганали правой
            if (countToHorizontal == DOTS_TO_WIN || countToVertical == DOTS_TO_WIN || downLeftcntToDiagLeft == DOTS_TO_WIN || downLeftcntToDiagRight == DOTS_TO_WIN) return true;
        }
        int downRightcntToDiagLeft = 0;
        int downRightcntToDiagRight = 0;
        for (int i = 1; i < SIZE; i++) {//Проверка нижнего правого квадранта 4х4
            int countToVertical = 0;
            int countToHorizontal = 0;
            for (int j = 1; j < SIZE; j++) {
                if (map[i][j] == symb) {countToHorizontal += 1;} //Проверка горизонтальных элементов
                if (map[j][i] == symb) {countToVertical += 1; }// Проверка вертикальных элементов
            }
            if (map[i][i] == symb) { downRightcntToDiagLeft += 1; }//Проверка диагонали левой
            if (map[i][SIZE - i] == symb) {downRightcntToDiagRight += 1;}//Проверка диаганали правой
            if (countToHorizontal == DOTS_TO_WIN || countToVertical == DOTS_TO_WIN || downRightcntToDiagLeft == DOTS_TO_WIN || downRightcntToDiagRight == DOTS_TO_WIN) return true;
        }
       return false;
        }

    //заполнение поля
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    //проверка ИИ хода пользователя по Y




}





