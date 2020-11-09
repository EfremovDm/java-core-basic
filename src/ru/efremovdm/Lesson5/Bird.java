package ru.efremovdm.Lesson5;

class Bird extends Animal {

    private static final String ANIMAL_NAME = "Птица";

    @Override
    void run(int length) {
        boolean result = length <= 5;
        if (result)
            _length = length;
        showResult(ANIMAL_NAME, result ? RUN_NAME : NA_NAME);
    }

    @Override
    void jump(double height) {
        boolean result = height <= 0.2;
        if (result)
            _height = height;
        showResult(ANIMAL_NAME, result ? JUMP_NAME : NA_NAME);
    }
}