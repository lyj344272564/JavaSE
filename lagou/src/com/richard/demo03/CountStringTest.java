package com.richard.demo03;
/**
 * 编程统计字符串"ABCD123!@#$%ab"中大写字母、小写字母、数字、其它字符的个数并打印出来
 */
public class CountStringTest {

    public static void main(String[] args) {

        String str = new String("ABCD123!@#$%ab");

        int[] arr = new int[4];

        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (c >='A' && c<='Z') {
                arr[0]++;
            } else if (c>='a' && c<='z') {
                arr[1]++;
            } else if (c>='0' && c<='9') {
                arr[2]++;
            } else {
                arr[3]++;
            }
        }
        System.out.println("其中大写字母出现了" + arr[0]
                + "次，其中小写字母出现了" + arr[1] + "次，"
                + "其中数字字符出现了" + arr[2] + "次，"
                + "其它字符出现了" + arr[3] + "次！");

    }
}
