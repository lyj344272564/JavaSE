package com.richard.demo03;

import java.util.*;

/**
 *
 使用集合实现斗地主游戏的部分功能，要求如下：

 （1）首先准备 54 张扑克牌并打乱顺序。

 （2）由三个玩家交替摸牌，每人 17 张扑克牌，最后三张留作底牌。

 （3）查看三个玩家手中的扑克牌和底牌。

 （4）其中玩家手中的扑克牌需要按照大小顺序打印，规则如下：

 手中扑克牌从大到小的摆放顺序：大王,小王,2,A,K,Q,J,10,9,8,7,6,5,4,3
 */
public class PokerTest {

    /**
     * 自定义静态方法实现扑克牌的打印功能
     * @param i
     * @param list
     * @param pokerMap
     */
    public static void showPoker(int i, List<Integer> list, Map<Integer, String> pokerMap) {
        if (i <= 3) {
            System.out.print("第" + i + "个玩家的扑克牌有：");
        } else {
            System.out.print("底牌有：");
        }
        for (Integer integer : list) {
            System.out.print(pokerMap.get(integer) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 1.准备List集合来存放4种花色和13种点数
        List<String> colorList = Arrays.asList("♠", "♥", "♣", "♦");
        List<String> pointList = Arrays.asList("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        // 2.准备Map集合来存放生成的54张扑克牌，指定扑克牌的编号作为key，使用扑克牌作为value，从而实现对应关系的建立
        // 建立关系的目的是为了后续便于打乱后还能从大到小进行排序，需要单独记录所有编号
        Map<Integer, String> pokerMap = new HashMap<>();
        List<Integer> numberList = new ArrayList<>();

        int cnt = 0;
        numberList.add(cnt);
        pokerMap.put(cnt++, "大王");

        numberList.add(cnt);
        pokerMap.put(cnt++, "小王");
        // 2.2 存放花色和点数组合出来的52张扑克牌
        for (String point : pointList) {
            for (String color : colorList) {
                numberList.add(cnt);
                pokerMap.put(cnt++, color+point);
            }
        }

        // 洗牌
        Collections.shuffle(numberList);

        List<Integer> player1 = new ArrayList<>();
        List<Integer> player2 = new ArrayList<>();
        List<Integer> player3 = new ArrayList<>();
        List<Integer> remains = new ArrayList<>();

        for (int i=0; i<numberList.size(); i++) {
            Integer integer = numberList.get(i);
            if (i >= 51) {
                remains.add(integer);
            } else if (0 == i%3) {
                player1.add(integer);
            } else if (1 == i%3) {
                player2.add(integer);
            } else {
                player3.add(integer);
            }

        }
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(remains);
        showPoker(1, player1, pokerMap);
        showPoker(2, player2, pokerMap);
        showPoker(3, player3, pokerMap);
        showPoker(4, remains, pokerMap);

    }

}