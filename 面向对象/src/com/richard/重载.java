package com.richard;

public abstract class 重载 {

    public static void main(String[] args) {
        StringBuilder messages = new StringBuilder();
        StringBuilder messages2 = new StringBuilder("To do\n");
    }

    public double add(){

        return 0;
    }

    public abstract double add(int a, int b);
}
