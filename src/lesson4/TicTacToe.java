package lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;

    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static final String EMPTY_COLUMN_FIRST = "  ";
    public static final String EMPTY = " ";

    public static char[][] map = new char[SIZE][SIZE];
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {

        initMap();

        printMap();

        playGame();


    }

    private static void playAgain() {
        int userUnswer;
        System.out.println("Хотите сыграть еще раз? 1 - да, 0 - нет");
        userUnswer = scanner.nextInt();
        if (userUnswer == 1) {
            initMap();
            printMap();
            playGame();
        }
    }

    private static void playGame() {

        while (true) {
            //ход человека
            humanTurn();
            printMap();
            if (checkEnd(DOT_X, "Вы победили!")) {
                System.exit(0);
            }

            //ход ИИ
            aiTurn();
            printMap();
            if (checkEnd(DOT_O, "Машина сильнее! Ты проиграл!")) {
                System.exit(0);
            }
        }
    }

    private static boolean checkEnd(char symbol, String winMessage) {

        if (checkWin(symbol)) {
            System.out.println(winMessage);
            playAgain();
            return true;
        }

        if (isMapFull()) {
            System.out.println("Ничья!");
            playAgain();
            return true;
        }


        return false;
    }

    private static boolean isMapFull() {
        for (char[] chars : map) {
            for (char aChar : chars) {
                if (aChar == DOT_EMPTY)
                    return false;
            }
        }
        return true;
    }

    private static boolean checkWin(char symbol) {
        // СЧИТАЕТЬ РАЗРЫВЫ не могу исправить
        int toWin1 = 0,  toWin2 = 0;

        for (int i = 0; i < SIZE; i++) {
            int winCol = 0, winRow = 0;

            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symbol) winRow++;
                if (map[j][i] == symbol) winCol++;
            }

            if (winRow == DOTS_TO_WIN || winCol == DOTS_TO_WIN) return true;

            if (map[i][i] == symbol) toWin1++;
            if (map[i][SIZE-i-1] == symbol) toWin2++;
        }

        if (toWin1 == DOTS_TO_WIN || toWin2 == DOTS_TO_WIN) return  true;

        return false;
    }
        // сократил условие

      /*  for (int i = 0; i < SIZE; i++) {
            if (map[i][0] == symbol && map[i][1] == symbol && map[i][2] == symbol && map[i][3] == symbol || map[i][1] == symbol && map[i][2] == symbol && map[i][3] == symbol && map[i][4] == symbol)
                return true;
        }
        for (int j = 0; j < SIZE; j++) {
            if (map[0][j] == symbol && map[1][j] == symbol && map[2][j] == symbol && map[3][j] == symbol || map[1][j] == symbol && map[2][j] == symbol && map[3][j] == symbol && map[4][j] == symbol)
                return true;
        }
        for (int i = 0; i <= SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                //не получилось уменьшить =(
                //наверное должно быть что то вроде??
              *//*  for (int i = 0, j = 0; i < a.length ; i++) {
                    if (a[i][j] == 1) checkdiagonal++;
                    j++;*//*
                if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol && map[3][3] == symbol || map[4][4] == symbol && map[3][3] == symbol && map[2][2] == symbol && map[1][1] == symbol
                        || map[1][0] == symbol && map[2][1] == symbol && map[3][2] == symbol && map[4][3] == symbol || map[3][4] == symbol && map[2][3] == symbol && map[1][2] == symbol && map[0][1] == symbol
                        || map[3][0] == symbol && map[2][1] == symbol && map[1][2] == symbol && map[0][3] == symbol || map[4][3] == symbol && map[3][2] == symbol && map[2][1] == symbol && map[1][0] == symbol
                        || map[0][4] == symbol && map[1][3] == symbol && map[2][2] == symbol && map[3][1] == symbol || map[4][0] == symbol && map[3][1] == symbol && map[2][2] == symbol && map[1][3] == symbol)
                    return true;
            }
        }


        return false;
    }
*/

    private static void humanTurn() {
        int rowNumber, colNumber;

        do {
            System.out.println("Ход пользователя! Введите номера строки и столбца");
            System.out.print("Строка = ");
            rowNumber = scanner.nextInt();
            System.out.print("Столбец = ");

            colNumber = scanner.nextInt();
        } while (!isCellValid(rowNumber, colNumber));

        map[rowNumber - 1][colNumber - 1] = DOT_X;
    }

    private static void aiTurn() {
        int rowNumber, colNumber;

        do {
            rowNumber = random.nextInt(SIZE ) + 1;
            colNumber = random.nextInt(SIZE ) + 1;
        } while (!isCellValid(rowNumber, colNumber));

        map[rowNumber - 1][colNumber - 1] = DOT_O;
    }
        //пробовал много вариаций так и не вышло =(
      /*  int rowNumber = SIZE;
        int colNumber = SIZE;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_X && map[i][j + 1] == DOT_X) {
                    if (map[i][j + 2] == DOT_EMPTY) {
                        map[i][j + 2] = DOT_O;
                    }
                    if (map[i][j] == DOT_X) {
                        if (map[i + 1][j] == DOT_EMPTY) {
                            map[i + 1][j] = DOT_O;
                        }
                    }


                }
            }
        }
    }*/

    private static boolean isCellValid(int rowNumber, int colNumber) {
        if ((rowNumber < 1 || rowNumber > SIZE) || (colNumber < 1 || colNumber > SIZE)) {
            System.out.println("\nПроверьте значения строки и столбца");
            return false;
        }

        if (map[rowNumber - 1][colNumber - 1] != DOT_EMPTY) {
            System.out.println("\nВы выбрали занятую ячейку");
            return false;
        }

        return true;
    }

    private static void printMap() {
        printMapHeader();

        printMapRows();
    }

    private static void printMapRows() {
        for (int i = 0; i < SIZE; i++) {
            printColumnNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + EMPTY);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void printMapHeader() {
        System.out.print(EMPTY_COLUMN_FIRST);
        for (int i = 0; i < SIZE; i++) {
            printColumnNumber(i);
        }
        System.out.println();
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printColumnNumber(int i) {
        int columnNumber = i + 1;
        System.out.print(columnNumber + EMPTY);
    }
}
