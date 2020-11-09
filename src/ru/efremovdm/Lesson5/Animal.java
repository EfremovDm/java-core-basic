package ru.efremovdm.Lesson5;

abstract class Animal {

    protected int _length;
    protected double _height;

    protected static final String RUN_NAME = "побежала";
    protected static final String JUMP_NAME = "прыгнула";
    protected static final String SWIM_NAME = "поплыла";
    protected static final String NA_NAME = "не смогла";

    abstract void run(int length);
    abstract void jump(double height);

    static void showResult(String animal, String action) {
        System.out.println(animal + ": " + action);
    }
}