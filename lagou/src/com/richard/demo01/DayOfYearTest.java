package com.richard.demo01;

import java.util.Scanner;
/**
 * 编程实现根据用户输入的年月日信息来计算这一年中的第几天并打印出来
 */
public class DayOfYearTest {

    public static void main(String[] args) {

        System.out.println("请输入年月日:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        int[] monthArr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int days = day;

        // 因为最后欧一个月不算所以往前模拟
        for(int i = month-1; i >= 1; i--) {
            days += monthArr[i-1];
        }
        // 2.3 若该月份大于2月且该年份为闰年则需要总天数上加1
        if ((month>2) && (0==year%4 && 0!=year%100 || 0==year%400)) {
            days += 1;
        }

        System.out.println("该日期是这一年中的第" + days + "天！");

    }

}
