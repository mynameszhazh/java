package src.examples.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerProDemo {
    public static void main(String[] args) {
        // 创建一个牌盒 并添加牌
        HashMap<Integer, String> porkers = new HashMap<Integer, String>();

        ArrayList<Integer> indexPoker = new ArrayList<Integer>();

        String[] colors = { "♠", "❤", "♦", "♣" };
        String[] counts = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };

        int index = 0;
        for (String count : counts) {
            for (String color : colors) {
                porkers.put(index, color + count);
                indexPoker.add(index);
                index++;
            }
        }
        porkers.put(index, "大王");
        indexPoker.add(index);
        index++;
        porkers.put(index, "小王");
        indexPoker.add(index);

        // 打乱牌
        Collections.shuffle(indexPoker);

        // 加入玩家和底牌库
        TreeSet<Integer> xPoker = new TreeSet<Integer>();
        TreeSet<Integer> jPoker = new TreeSet<Integer>();
        TreeSet<Integer> hPoker = new TreeSet<Integer>();
        TreeSet<Integer> dbPoker = new TreeSet<Integer>();

        for (int i = 0; i < porkers.size(); i++) {
            Integer currentPoke = indexPoker.get(i);
            if (i >= porkers.size() - 3) {
                dbPoker.add(currentPoke);
                continue;
            }
            if (i % 3 == 0) {
                xPoker.add(currentPoke);
            } else if (i % 3 == 1) {
                jPoker.add(currentPoke);
            } else if (i % 3 == 2) {
                hPoker.add(currentPoke);
            }
        }
        lookPoker("x", xPoker, porkers);
        lookPoker("j", jPoker, porkers);
        lookPoker("h", hPoker, porkers);
        lookPoker("底牌", dbPoker, porkers);
    }

    static void lookPoker(String name, TreeSet<Integer> arr, HashMap<Integer, String> pokers) {
        System.out.println(name + "的牌");
        for (Integer item : arr) {
            String val = pokers.get(item);
            System.out.println(val);
        }
        System.out.println("----------");
    }
}
