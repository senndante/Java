package lesson2;

public class homework_2 {

    public static void main(String[] args) {

        System.out.println("Замена 0 на 1, 1 на 0 в массиве.");
        changeArrNum();
        System.out.println("\nЗаполнение массива.");
        emptyArray();
        System.out.println("\nУмножение чисел <6 на 2 в массиве.");
        num_X2_Array();
        System.out.println("\nКвадратный двумерный массив.");
        squareArray();
        System.out.println("Поиск минимального и максимального числа.");
        maxMinNumbArray();
        System.out.println("Сумма чисел левой и правой части массива.");
        System.out.println(checkBalance(new int[]{3, 4, 5, 1, 1, 2, 1, 7}));
        System.out.println(checkBalance(new int[]{3, 1, 0, 1, 9}));
        System.out.println("Смещение эелементов массива.");
        offsetArray(new int[]{1, 2, 3, 4, 5, 6}, 2);
        System.out.println("\nМассив с нечетными числами.");
        arrOdd();
    }


    static void changeArrNum() {
        int[] mass = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("Массив. ");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
            if (mass[i] == 0) mass[i] = 1;
            else mass[i] = 0;
        }
        System.out.print("\nМассив после изменения.  ");
        for (int i : mass) {
            System.out.print(i + " ");
        }
    }


    static void emptyArray() {
        int[] mass = new int[8];

        for (int i = 0, j = 0; i < mass.length; i++, j += 3) {
            mass[i] = j;
            System.out.print(mass[i] + " ");
        }
    }

    static void num_X2_Array() {
        int[] mass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.print("Массив. ");
        for (int i : mass) {
            System.out.print(i + " ");
        }

        System.out.print("\nМассив после изменения.  ");
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < 6) mass[i] *= 2;
            System.out.print(mass[i] + " ");
        }
    }


    static void squareArray() {
        int length = 4;
        int[][] mass = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if ((i == j) || (i == length - 1 - j)) {
                    mass[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }


    static void maxMinNumbArray() {
        int[] mass = {9, -13, 7, -3, 0, 18, 15};
        int max = mass[0];
        int min = mass[0];
        System.out.print("Массив. ");
        for (int i : mass) {
            System.out.print(i + " ");
        }
        for (int i = 0; i != mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
            if (mass[i] < min) {
                min = mass[i];
            }
        }
        System.out.println("\nМинимальное число. " + min + "\nМаксимальное число. " + max);

    }


    static boolean checkBalance(int[] mass) {
        int rightSideSum = 0;
        int leftSideSum = 0;

        for (int i = 0; i < mass.length + 1; i++) {
            rightSideSum = 0;
            leftSideSum = 0;

            for (int j = 0; j < i; j++) {
                rightSideSum += mass[j];
            }

            for (int j = i; j < mass.length; j++) {
                leftSideSum += mass[j];
            }

            if (rightSideSum == leftSideSum) return true;
        }
        return false;
    }


    static void offsetArray(int[] mass, int n) {
        System.out.print("Массив. ");
        for (int i : mass) {
            System.out.print(i + " ");
        }

        System.out.print("(n = " + n + ")");

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int set = mass[mass.length - 1];
                for (int j = mass.length - 1; j > 0; j--) {
                    mass[j] = mass[j - 1];
                }
                mass[0] = set;
            }
        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                int set = mass[0];
                for (int j = 0; j < mass.length - 1; j++) {
                    mass[j] = mass[j + 1];
                }
                mass[mass.length - 1] = set;
            }
        }

        System.out.print("\nМассив после смещения.  ");
        for (int i : mass) {
            System.out.print(i + " ");

        }

    }

    static void arrOdd() {
        int x = 0;
        for(int i = 1; i <= 99; i++){
            if(i %2 != 0)x++;
        }
        int[] Mas = new int[x];
        for(int i = 1, j = 0; i <= 99; i++){
            if(i % 2 != 0){
                Mas[j] = i;
                System.out.print(Mas[j] + " ");
                j++;
            }
        }
        }

    }
