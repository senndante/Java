package lesson5;

public class HomeWork_5 {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Петров Иван Федорович", "водитель", "petrov@mail.ru", 584623, 50000, 43);
        employees[1] = new Employee("Иванова Анна Валентиновна", "бухгалтер", "ivanova11@mail.ru", 782546, 70000, 47);
        employees[2] = new Employee("Семенюк Петр Семенович", "завхоз", "semenps@mail.ru", 527345, 53000, 38);
        employees[3] = new Employee("Васечкина Елена Петровна", "серкетарь", "vasyan@mail.ru", 472345, 32000, 24);
        employees[4] = new Employee("Меньшенин Герман Эдуардович", "директор", "patriot@gmail.com", 555555, 100000, 63);

        //Цикл вывода информации о сотрудниках старше 40 лет.

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].getInfo();
            }
        }
    }
}