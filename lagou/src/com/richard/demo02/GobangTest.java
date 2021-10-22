package com.richard.demo02;

public class GobangTest {
    public static void main(String[] args) {

        //1.声明一个GoBand类型的引用指向该类的对象
        Gobang gb = new Gobang();
        //2.调用成员方法来绘制棋盘
        gb.paint();
        //3.调用成员方法来进行下棋
        gb.play();

    }
}
