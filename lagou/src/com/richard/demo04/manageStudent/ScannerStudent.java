package com.richard.demo04.manageStudent;

import java.util.Scanner;

/**
 * 实现扫描器工具类的封装，这样可以实现扫描器的共用效果
 */
public class ScannerStudent {
	/**
	 * 将Scanner对象打包成工具类的成员变量
	 */
	private static Scanner sc = new Scanner(System.in);
	
	/**
	 * 编程实现扫描器对象的获取
	 * @return
	 */
	public static Scanner getScanner() {
		return sc;
	}
	
	/**
	 * 编程实现扫描器的关闭
	 */
	public static void closeScanner() {
		sc.close();
	}
}
