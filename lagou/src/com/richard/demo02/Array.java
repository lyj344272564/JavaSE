package com.richard.demo02;

import java.util.Random;

public class Array {

    private static final int N = 16;
    private static int[][] arr = new int[N][N];

    public static void main(String[] args) {

        Random random = new Random();

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                arr[i][j] = random.nextInt(100);
            }
        }

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------");

        for (int i=0; i<N; i++) {
            int sum = 0;
            for (int j=0; j<N; j++) {
                sum += arr[i][j];
            }
            System.out.println("第" + (i+1) + "行所有的随机数的和为："  + sum);
        }

        System.out.println("---------------------------------------------------");

        for (int i=0; i<N; i++) {
            int sum = 0;
            for (int j=0; j<N; j++) {
                sum += arr[j][i];
            }
            System.out.println("第" + (i+1) + "列所有的随机数的和为："  + sum);
        }

        System.out.println("---------------------------------------------------");

        int sum = 0;
        for (int i=0; i<N; i++) {
            sum += arr[i][i];
        }
        System.out.println("从左上角到右下角所有元素的累和为：" + sum);

        System.out.println("---------------------------------------------------");

        sum = 0;
        for (int i=0; i<N; i++) {
            sum += arr[i][N-i-1];
        }
        System.out.println("从左上角到右下角所有元素的累和为：" + sum);


    }
}
