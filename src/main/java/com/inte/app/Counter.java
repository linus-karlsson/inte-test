package com.inte.app;

public class Counter {
    private int number;

    public Counter(int number) {
        this.number = number;
    }

    public void increaseNumber() {
        number++;
    }

    public int getNumber() {
        return number;
    }
}
