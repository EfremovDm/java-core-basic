package ru.efremovdm;

public class Lesson1 {

    /**
     * 1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
     *
     * @param args
     */
    public static void main(String[] args) {
        second();
        System.out.println(thrid(1,2,3, 4));
        System.out.println(fouth(5, 4));
        System.out.println(fifth(725));
        System.out.println(sixth(2020));
    }

    /**
     * 2. Создать переменные всех пройденных типов данных и инициализировать их значения.
     */
    public static void second(){
        int i = 1;
        boolean bul = true;
        char ch = '2';
        short sh = 3;
        long l = 4;
        double d = 5.0f;
        float fl = 12345;
        String s = "df";
    }

    /**
     * 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
     * где a, b, c, d – входные параметры этого метода.
     *
     * @param a
     * @param b
     * @param c
     * @param d
     * @return
     */
    public static float thrid(float a, float b, float c, float d){
        if (d == 0) { // or try variant
            System.out.println("Zero error!");
            return 0;
        }
        return a * (b + (c / d));
    }

    /**
     * 4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах
     * от 10 до 20(включительно), если да – вернуть true, в противном случае – false.
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean fouth(int a, int b){
        return 10 <= a + b && a + b <= 20;
    }

    /**
     * 5. Создать метод, который принимает число.
     * Если данное число больше 100 и меньше 999 включительно - вывести в консоль цифры данного числа в обратном порядке.
     * Например, введено число 725 -> в консоле будет: 527.
     *
     * @param a
     */
    public static String fifth(int a){
        return (a > 100 && a <= 999)
                ? new StringBuffer(Integer.toString(a)).reverse().toString()
                : "-";
    }

    /**
     * 6. ** Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
     * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     *
     * @param year
     * @return
     */
    public static boolean sixth(int year){
        return year % 100 != 0 && year % 4 == 0 || year % 400 ==0;
    }

    /**
     * 7. Обязательно ознакомиться с Git
     * no problem!!!
     */
}
