package ru.efremovdm;

import java.util.Arrays;

public class Lesson2 {

    public static void main(String[] args) {

        Integer[] arFirst = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("1 arg: " + Arrays.toString(arFirst));
        System.out.println("1 res: " + Arrays.toString(
            first(arFirst)
        ) + "\n\r");

        Integer[] arSecond = new Integer[8];
        System.out.println("2 res: " + Arrays.toString(
            second(arSecond, 1, 3)
        ) + "\n\r");

        Integer[] arThird = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("3 arg: " + Arrays.toString(arThird));
        System.out.println("3 res: " + Arrays.toString(
            third(arThird, 6, 2)
        ) + "\n\r");

        Integer[] arFouth = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("4 arg: " + Arrays.toString(arFouth));
        System.out.println("4 res: " + Arrays.toString(
            fouth(arFouth)
        ) + "\n\r");

        Integer[][] arFifth = fifth(5);
        int length = arFifth.length;
        for (int i = 0; i < length; ++i) {
            System.out.println("5 res: " + Arrays.toString(arFifth[i]) + (i == length - 1 ? "\n\r" : ""));
        }

        Integer[][] arSixth = {{1, 1, 1, 2, 1}, {2, 1, 1, 2, 1}, {10, 1, 2, 3, 4}};
        for (Integer[] six: arSixth) {
            System.out.println("6 arg: " + Arrays.toString(six));
            System.out.println("6 res: " +
                sixth(six) + "\n\r"
            );
        }

        Integer[] arSeventh = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("7 arg: " + Arrays.toString(arSeventh));
        System.out.println("7 res: " + Arrays.toString(
            seventh(arSeventh, 2)) + "\n\r"
        );

        Integer[][] arHardcore = {{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}, {1, 99, 100}};
        System.out.println("Hardcore arg: " + Arrays.toString(arHardcore[0]) + ", " + Arrays.toString(arHardcore[1]));
        System.out.println("Hardcore res: " + Arrays.toString(
            hardcore1(arHardcore[0], arHardcore[1])
        ));
    }

    /**
     * 1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
     *
     * @param ar
     * @return
     */
    private static Integer[] first(Integer[] ar) {

        /* // old style %-)
        int length = ar.length;
        for (int i = 0; i < length; ++i) {
            ar[i] = ar[i].equals(1) ? 0 : 1;
        } */

        // functional style
        Arrays.asList(ar).replaceAll(s -> s.equals(1) ? 0 : 1);

        return ar;
    }

    /**
     * 2 Задать пустой целочисленный массив размером 8. Написать метод, который
     * c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
     *
     * @param ar
     * @param startNumber
     * @param step
     * @return
     */
    private static Integer[] second(Integer[] ar, int startNumber, int step) {

        int length = ar.length;

        for (int i = 0; i < length; ++i) {
            ar[i] = startNumber;
            startNumber += step;
        }

        return ar;
    }

    /**
     * 3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод,
     * принимающий на вход массив и умножающий числа меньше 6 на 2;
     *
     * @param ar
     * @param threshold
     * @param factor
     * @return
     */
    private static Integer[] third(Integer[] ar, int threshold, int factor) {

        int length = ar.length;
        for (int i = 0; i < length; ++i) {
            ar[i] = ar[i] < threshold ? ar[i] * factor : ar[i];
        }

        return ar;
    }

    /**
     * 4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
     *
     * @param ar
     * @return
     */
    private static Integer[] fouth(Integer[] ar) {

        // тут захотелось просто ленивое решение "по фану" (возможно только на небольшом массиве), классика надоела.
        Arrays.sort(ar);

        return new Integer[]{ar[0], ar[ar.length - 1]};
    }

    /**
     * 5 ^ Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
     * заполнить его диагональные элементы единицами, используя цикл(ы);
     *
     * @param size
     * @return Integer[][]
     */
    private static Integer[][] fifth(int size) {

        Integer[][] ar = new Integer[size][size];
        int length = ar.length;

        for (int i = 0; i < length; ++i) {
            for (int j = 0; j < length; ++j) {
                ar[i][j] = i == j ? 1 : 0;
            }
        }

        return ar;
    }

    /**
     * 6 ^^ Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть
     * true если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры:
     *
     * checkBalance([1, 1, 1, || 2, 1]) → true,
     * checkBalance ([2, 1, 1, 2, 1]) → false,
     * checkBalance ([10, || 1, 2, 3, 4]) → true.
     * Абстрактная граница показана символами ||, эти символы в массив не входят
     */
    private static Boolean sixth(Integer[] ar) {

        int lSum, rSum;
        int length = ar.length;

        for (int i = 0; i < length + 1; i++) {
            lSum = 0;
            rSum = 0;

            for (int j = 0; j < i; j++) {
                lSum += ar[j];
            }

            for (int j = i; j < length; j++) {
                rSum += ar[j];
            }

            if (lSum == rSum)
                return true;
        }

        return false;
    }

    /**
     * 7 ^^^ Написать метод, которому на вход подаётся одномерный массив и число n
     * (может быть положительным, или отрицательным), при этом метод должен циклически
     * сместить все элементы массива на n позиций.
     * [1,2,3,4,5], -2 => [3,4,5,1,2]
     * [1,2,3,4,5], 2 => [4,5,1,2,3]
     * 8 ^^^^ Не пользоваться вспомогательным массивом при решении задачи 7.
     *
     * @param ar
     * @param n
     * @return
     */
    private static Integer[] seventh(Integer[] ar, int n) {

        int length = ar.length;

        if (n > 0) {
            for (int x = 0; x < n; x++) {
                int buf = ar[length - 1];
                if (length - 1 >= 0)
                    System.arraycopy(ar, 0, ar, 1, length - 1);
                ar[0] = buf;
            }
        }
        else if (n < 0) {
            for (int x = 0; x > n; x--) {
                int buf = ar[0];
                System.arraycopy(ar, 1, ar, 0, length - 1);
                ar[length - 1] = buf;
            }
        }

        return ar;
    }

    /**
     * Задание по хардкору. Нужен метод, который получает в параметры 2 массива (разной длины) int-чисел.
     * Он (метод) должен вернуть массив значений, которые есть в 1 массиве, но их нет во втором
     *
     * @param ar
     * @param ar2
     * @return
     */
    private static Object[] hardcore1(Integer[] ar, Integer[] ar2) {
        return Arrays.stream(ar)
                .distinct()
                .filter(x -> Arrays.stream(ar2).noneMatch(y -> y == x))
                .toArray();
    }
}
