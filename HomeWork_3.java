package lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork_3 {


    public static void main(String[] args) {

        guessTheNumber();
        guessTheFruit();

    }

    private static Random random = new Random();

    private static void guessTheNumber() {

        Scanner scanner = new Scanner(System.in);
        do {
            int numComp = random.nextInt(10);
            System.out.println("Отгадайте число от 0 до 9");
            for (int i = 3; i > 0; i--) {
                System.out.println("Введите число");
                int whatNum = scanner.nextInt();
                if (whatNum == numComp) {
                    System.out.println("Победа!");
                    break;
                }
                System.out.println(whatNum > numComp ? "Введенное число больше " : "Введенное число меньше ");
                System.out.println((i - 1) > 0 ? " у вас осталось " + (i - 1) + " попыток." : "Game Over.");
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
        }
        while (scanner.nextInt() == 1);
    }

    private static void guessTheFruit() {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int indWord = random.nextInt(words.length - 1);
        String word = words[indWord];
        int lenWord = word.length();
        System.out.println("Отгадайте фрукт/овощь");
        System.out.println(Arrays.toString(words));
        System.out.println(word);
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите ответ: (для выхода из игры, просто нажмите Enter)");
            String answer = scanner.nextLine();
            if (answer.equals("0")) break;
            else if (word.equals(answer)) {
                System.out.println("Победа!");
                break;
            }
            char[] charsAnswer = answer.toCharArray();
            for (int i = 0; i < lenWord; i++) {
                if (i >= charsAnswer.length) break;
                if (word.charAt(i) != charsAnswer[i]) charsAnswer[i] = '#';
            }
            StringBuilder comment = new StringBuilder(String.valueOf(charsAnswer));
            for (int i = comment.length(); i < 15; i++) comment.append("#");
            System.out.println(comment);
        }
        while (true);
    }

}

