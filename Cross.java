package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Cross {

    static int SIZE = 5;
    static int WIN_line = 4;
    static char[][] field = new char[SIZE][SIZE];

    static char PLAYER_DOT = 'X';
    static char AI_DOT = 'O';
    static char EMPTY_DOT = '*';

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    // заполнить поле
    static void initField() {
        field = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                field[i][j] = EMPTY_DOT;
    }

    // метод для вывода на консоль поля
    static void printField() {
        for (int i = 0; i < SIZE + 1; i++) {
            System.out.print("  " + i);
        }

        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print("  " + (i + 1) + "  ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(field[i][j] + "  ");
            }
            System.out.println();
        }
    }


    // проверка валидности ячейки
    static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE)
            return false;
        return field[y][x] == EMPTY_DOT;
    }

    // ход человека
    static void playerStep(char sym) {
        int x;
        int y;
        do {
            System.out.println("Введите координаты: X Y (1 - 5)");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        field[y][x] = sym;
    }

    // ход ПК
    static void aiStep(char sym, char enemySym) {
        int x, y;
        for (x = 0; x < SIZE; x++)
            for (y = 0; y < SIZE; y++)
                if (isCellValid(x, y)) {
                    field[y][x] = enemySym;
                    if (checkWin(enemySym)) {
                        field[y][x] = sym;
                        return;
                    }
                    field[y][x] = EMPTY_DOT;
                }
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        field[y][x] = sym;
    }


    static boolean isDraw() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (field[i][j] == EMPTY_DOT)
                    return false;
        return true;
    }

    static boolean checkWin(char sym) {
        for (int y = 0; y < SIZE; y++)
            for (int x = 0; x < SIZE; x++)
                for (int dy = -1; dy < 2; dy++)
                    for (int dx = -1; dx < 2; dx++)
                        if (checkLine(x, y, dx, dy, sym) == WIN_line)
                            return true;
        return false;

    }

    static int checkLine(int x, int y, int dx, int dy, char sym) {
        int count = 0;
        if (dx == 0 && dy == 0)
            return 0;
        for (int i = 0, xi = x, yi = y;
             i < WIN_line; i++, xi += dx, yi += dy)
            if (xi >= 0 && yi >= 0 && xi < SIZE &&
                    yi < SIZE && field[yi][xi] == sym)
                count++;
        return count;
    }

    public static void main(String[] args) {
        initField();

        while (true) {
            printField();
            playerStep(PLAYER_DOT);

            if(checkWin(PLAYER_DOT)) {
                System.out.println("Player WIN!");
                break;
            }
            if(isDraw()) {
                System.out.println("DRAW");
                break;
            }

            aiStep(AI_DOT, PLAYER_DOT);
            if(checkWin(AI_DOT)) {
                System.out.println("SKYNET WIN!");
                break;
            }
            if(isDraw()) {
                System.out.println("DRAW");
                break;
            }
        }
        printField();
    }


}
