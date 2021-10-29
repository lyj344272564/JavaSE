package com.richard.demo03;

import org.omg.CORBA.INTERNAL;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 准备一个 HashMap 集合，统计字符串"123,456,789,123,456"中每个数字字符串出现的次数并打印出来。

 如：

 123 出现了 2 次

 456 出现了 2 次

 789 出现了 1 次

 */
public class MapCountTest {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        String str = "123,456,789,123,456";
        String[] strings = str.split(",");
        for (String s : strings) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s)+1);
            } else {
                map.put(s,1);
            }
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + "出现了：" + entry.getValue() + "次。");
        }

    }
}
