package ru.efremovdm.Lesson4;

/**
 * 1. Создать класс "Сотрудник" с полями:
 * ФИО, должность, телефон, зарплата, возраст;
 */
public class Employees {

    private int id;
    private String fio;
    private String position;
    private String phone;
    private int salary;
    private int age;

    /**
     * 2. Конструктор класса должен заполнять эти поля при создании объекта;
     *
     * @param id
     * @param fio
     * @param position
     * @param phone
     * @param salary
     * @param age
     */
    public Employees(int id, String fio, String position, String phone, int salary, int age) {
        this.id = id;
        this.fio = fio;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    /**
     * 3. Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
     */
    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public String getPosition() {
        return position;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}