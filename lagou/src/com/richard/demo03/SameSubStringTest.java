package com.richard.demo03;

/**
 *  编程获取两个指定字符串中的最大相同子串。
 *
 *  如： s1="asdafghjka", s2="aaasdfg" 他们的最大子串为"asd"
 *
 *  提示： 将短的那个串进行长度依次递减的子串与较长的串比较。
 */
public class SameSubStringTest {

    public static void main(String[] args) {
        String s1 = new String("asdafghjka"); // 10
        String s2 = new String("aaasdfg"); // 7

        int len = s2.length();
        // 使用外层for循环控制较短子串依次递减的功能
        for (int i=0; i<len; i++) {
            // 使用内层for循环控制长度固定时的所有子串情况
            for (int x=0,y=len-i; y<=len; x++,y++) { // 0,7   0,6  1,7   0,5  1,6  2,7  ...
                String subStr = s2.substring(x,y);
                if (s1.contains(subStr)) {
                    System.out.println("最大字串是：" + subStr);
                    return; // 结束当前方法
                }
            }
        }

    }

}
