package com.richard.demo01;

/**
 * 使用二维数组和循环实现五子棋游戏棋盘的绘制
 */
public class ChessBoardPrintTest {

    public static void main(String[] args) {

        int[][] chessBoard = new int[16][16];

         // 第一排单独输入
        for (int i=0; i<17; i++) {
            if (i == 0) {
                System.out.print(" ");
            } else {
                System.out.printf("%x",i-1);
            }
        }

        System.out.println();

        for (int i=0; i<16; i++) {
            System.out.printf("%x",i);
            for (int j=0; j<16; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }

    }

}
