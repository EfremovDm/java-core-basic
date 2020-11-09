package ru.efremovdm.Lesson5;

class Horse extends Animal {

    private static final String ANIMAL_NAME = "Лошадь";

    private int _lengthSwim;

    @Override
    void run(int length) {
        boolean result = length <= 500;
        if (result)
            _length = length;
        showResult(ANIMAL_NAME, result ? RUN_NAME : NA_NAME);
    }

    @Override
    void jump(double height) {
        boolean result = height <= 3;
        if (result)
            _height = height;
        showResult(ANIMAL_NAME, result ? JUMP_NAME : NA_NAME);
    }

    void swim(int length) {
        boolean result = length <= 100;
        if (result)
            _lengthSwim = length;
        showResult(ANIMAL_NAME, result ? SWIM_NAME : NA_NAME);
    }
}