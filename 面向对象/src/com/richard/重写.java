package com.richard;

public class 重写 extends 重载{
    @Override
    public double add() {
        return super.add();
    }

    @Override
    public double add(int a, int b) {
        return 0;
    }
}
