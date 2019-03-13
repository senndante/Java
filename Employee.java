package lesson5;

public class Employee {

    //Поля ФИО, должность, email, телефон, зарплата, возраст.

    private String fio;
    private String position;
    private String email;
    private long phone;
    private long salary;
    private int age;

    //Конструктор класса.

    public Employee(String fio, String position, String email, int phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    //Метод, который выводит информацию об объекте в консоль.

    public void getInfo(){
        System.out.println("ФИО: " + fio + " Должность: " + position + " email: " + email + " Телефон: " + phone +
                " Зарплата: " + salary + " Возраст: " + age);
    }

    //Геттер для поля возраст.

    public int getAge() {
        return age;
    }
}
