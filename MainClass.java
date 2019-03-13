//Работу выполнил Протасов Андрей.


public class MainClass {
    public static void main(String[] args) {

        task_1();

//      Задание 1.  Создать переменные всех пройденных типов данных, и инициализировать их значения.

        System.out.println("a * (b + (c / d)) = " + task_2(4, 2, 6, 1));

//      Задание 2.  Написать метод вычисляющий выражение a * (b + (c / d)) и
//        возвращающий результат,где a, b, c, d – входные параметры этого метода.

        System.out.println(task_3(1, 15));

//       Задание 3. Написать метод, принимающий на вход два числа,
//        и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false.

        task_4(0);

//      Задание 4.  Написать метод, которому в качестве параметра передается целое число,
//        метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.

        System.out.println(task_5 (5));

//       Задание 5. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное.

        task_6("GeekBrains");

//       Задание 6. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!».

        task_7(2049);

//       Задание 7.  Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным,
//         кроме каждого 100-го, при этом каждый 400-й – високосный.

    }

    static void task_1() {
        System.out.println("Задание 1. Типы данных");
        byte b = 26;
        short s = 18;
        int i = 50;
        long l = 2268456L;
        float f = 88.5f;
        double d = 760.8;
        char ch = '$';
        boolean bl = true;
        String str = "i did it)";

        System.out.println("Значение byte = " + b);
        System.out.println("Значение short = " + s);
        System.out.println("Значение int = " + i);
        System.out.println("Значение long = " + l);
        System.out.println("Значение float = " + f);
        System.out.println("Значение double = " + d);
        System.out.println("Значение char = " + ch);
        System.out.println("Значение bollean = " + bl);
        System.out.println("Значение String = " + str);
    }

    static int task_2(int a, int b, int c, int d) {
        System.out.println("Задание 2. Формула");
        return a * (b + (c / d));

    }

    static boolean task_3(int a, int b) {
        System.out.println("Задание 3. Сумма чисел в указанном промежутке");
        int sum = a + b;
        if (sum > 10 && sum < 20) {
            return true;
        } else {
            return false;
        }
    }

    static void task_4(int a) {
        System.out.println("Задание 4. Проверка на положительное или отрицательное число");
        if (a >= 0) {
            System.out.println("Число " + a + " положительное");
        } else {
            System.out.println("Число " + a + " отрицательное");
        }
    }

    static boolean task_5(int a) {
        System.out.println("Задание 5. Определение отрицательного числа");
        if (a < 0) {
            return true;
        }
        return false;
    }

    static void task_6(String name) {
        System.out.println("Задание 6. Приветствие");
        System.out.println("Привет, " + name + "!");
    }

    static void task_7(int year) {
        System.out.println("Задание 7. Определение високосного года");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) {
            System.out.println(year + " г. не високосный");
        } else {
            System.out.println(year + " г. високосный");
        }
    }
}