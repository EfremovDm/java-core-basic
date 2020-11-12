package ru.efremovdm.Lesson6;

import java.io.*;
import java.util.Random;

/**
 * 1. Создать 2 текстовых файла, примерно по 50-100 символов в каждом (особого значения не имеет);
 *
 * 2. Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
 *
 * 3. * Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.
 */
public class Lesson6 {

    static String ABC = "0123456789ABCDEFGHIGKLMNOPQRSTUVWXYZabcdefghigklmnopqrstuvwxyz";

    public static void main() {

        String fistFile = "first.txt";
        String secondFile = "second.txt";
        String thirdFile = "third.txt";

        createFile(fistFile, createString(100));
        createFile(secondFile, createString(100));

        glueFiles(new String[]{fistFile, secondFile}, thirdFile);

        boolean finded = searchInFile(thirdFile, "1");
        System.out.println(finded ? "Слово найдено!" : "Слово не найдено!");
    }

    /**
     * Создание случайной последовательности
     *
     * @param len
     * @return
     */
    public static String createString(int len) {
        StringBuilder sb = new StringBuilder(len);
        Random rnd = new Random();
        for (int i = 0; i < len; i++) {
            sb.append(ABC.charAt(rnd.nextInt(ABC.length())));
        }
        return sb.toString();
    }

    /**
     * Создание файла
     *
     * @param fileName
     * @param text
     */
    public static void createFile(String fileName, String text) {
        try {
            PrintWriter pw = new PrintWriter(fileName);
            pw.write(text);
            pw.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Склейка файлов
     *
     * @param names
     * @param destinationName
     */
    public static void glueFiles(String[] names, String destinationName) {
        try {
            FileOutputStream fos = new FileOutputStream(destinationName);
            for (String name : names) {
                FileInputStream fis = new FileInputStream(name);
                int i;
                do {
                    i = fis.read();
                    if (i != -1) {
                        fos.write(i);
                    }
                }
                while (i != -1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Поиск слова в файле
     *
     * @param fileName
     * @param word
     * @return
     */
    public static boolean searchInFile(String fileName, String word) {

        boolean finded = false;

        try {
            FileInputStream fis = new FileInputStream(fileName);
            int symbol = 0;
            int index = 0;
            byte[] wordBytes = word.getBytes();
            do {
                symbol = fis.read();
                if (wordBytes[index] == symbol) {
                    index++;
                    if (index == wordBytes.length) {
                        finded = true;
                        break;
                    }
                } else {
                    index = 0;
                }
            }
            while (symbol != -1);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return finded;
    }
}
