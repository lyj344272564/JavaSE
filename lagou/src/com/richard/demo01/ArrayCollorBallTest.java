package com.richard.demo01;

import java.util.Arrays;
import java.util.Random;
/**
 * 实现双色球抽奖游戏中奖号码的生成，中奖号码由6个红球号码和1个蓝球号码组成。
 * 其中红球号码要求随机生成6个1~33之间不重复的随机号码。
 * 其中蓝球号码要求随机生成1个1~16之间的随机号码。
 */
public class ArrayCollorBallTest {

    public static void main(String[] args) {

        int[] arr = new int[7];

        Random ra = new Random();

        for (int i=0; i< arr.length-1; i++) {

            arr[i] = ra.nextInt(33)+1;
            // 实现了一个去重
            for (int j=i-1; j>0; j--) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }

        }

        arr[arr.length-1] = ra.nextInt(16)+1;
        System.out.print("本期开奖号码为：");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

}
