package com.richard.demo03.mansgeStudent;

import java.util.Scanner;

/**
 * 实现扫描器工具类的封装，这样可以实现扫描器的共用效果
 */
public class ScannerStudent {

    private static Scanner sc = new Scanner(System.in);

    public static Scanner getScanner() {
        return sc;
    }

    public static void closeScanner() {
        sc.close();
    }

}
