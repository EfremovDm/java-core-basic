package ru.efremovdm.Lesson5;

class Dog extends Animal {

    private static final String ANIMAL_NAME = "Собака";

    private int _lengthSwim;
    private int maxLength;

    Dog() {
        maxLength = Math.random() > 0.5 ? 400 : 600;
    }

    void swim(int length) {
        boolean result = length <= 10;
        if (result)
            _lengthSwim = length;
        showResult(ANIMAL_NAME, result ? SWIM_NAME : NA_NAME);
    }

    @Override
    void run(int length) {
        boolean result = length <= maxLength;
        if (result)
            _length = length;
        showResult(ANIMAL_NAME, result ? RUN_NAME : NA_NAME);
    }

    @Override
    void jump(double height) {
        boolean result = height <= 0.5;
        if (result)
            _height = height;
        showResult(ANIMAL_NAME, result ? JUMP_NAME : NA_NAME);
    }
}