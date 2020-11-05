package ru.efremovdm.Lesson4;

public class Lesson4 {

    public static void main(String[] args) {

        Employees[] employees = new Employees[5];

        /**
         * 7. ** При создании экземпляра класса Сотрудник присваивать ему уникальный порядковый номер.
         */
        int counter = 0;

        employees[0] = new Employees(++counter, "Ivanov","Директор","81231234512", 100000, 50);
        employees[1] = new Employees(++counter,"Petrov","Менеджер","81231234523", 5000, 20);
        employees[2] = new Employees(++counter,"Sidorov","Дизайнер","81231234534", 20000, 30);
        employees[3] = new Employees(++counter,"Ivanov2","Программист","81231234545", 80000, 40);
        employees[4] = new Employees(++counter,"Sidorov2","Редактор","81231234556", 40000, 60);

        int length = employees.length;

        /**
         * 4. Вывести при помощи методов из пункта 3 ФИО и должность.
         */
        System.out.println("fio: " + employees[2].getFio() + ", position: " + employees[2].getPosition());

        /**
         * 5. Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
         */
        for (int i = 0; i < length; i++) {
            if(employees[i].getAge() > 40){
                System.out.println(
                    "id: " + employees[i].getId()
                    + ", fio: " + employees[i].getFio()
                    + ", position: " + employees[i].getPosition()
                    + ", phone: " + employees[i].getPhone()
                    + ", salary: " + employees[i].getSalary()
                    + ", age: " + employees[i].getAge()
                );
            }
        }

        /**
         * 6. * Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000;
         */
        for (int i = 0; i < length; i++) {
            if(employees[i].getAge() > 45){
                employees[i].setSalary(employees[i].getSalary() + 5000);
            }
        }
    }
}
