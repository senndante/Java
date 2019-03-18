package lesson6;

import java.util.Scanner;

public class HomeWork_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дистанцию для бега: ");
        int distance_run = in.nextInt();
        System.out.println("Введите дистанцию для плавания: ");
        int distance_sw = in.nextInt();
        System.out.println("Введите высоту прыжка: ");
        double distance_jump = in.nextInt();

        Cat Cat1 = new Cat("Cat", 200, 0, 2);
        Dog Dog1 = new Dog("Dog#1", 400, 10, 0.5);
        Dog Dog2 = new Dog("Dog#2", 600, 10, 0.5);

        Cat1.running(distance_run);
        Cat1.swimming(distance_sw);
        Cat1.jumping(distance_jump);

        Dog1.running(distance_run);
        Dog1.swimming(distance_sw);
        Dog1.jumping(distance_jump);

        Dog2.running(distance_run);
        Dog2.swimming(distance_sw);
        Dog2.jumping(distance_jump);

    }

}

