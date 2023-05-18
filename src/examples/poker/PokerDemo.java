package src.examples.poker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PokerDemo {
    public static void main(String[] args) {
//        创建一个牌盒 并添加牌
        ArrayList<String> porkers = new ArrayList<String>();

        String[] colors = {"♠", "❤", "♦", "♣"};
        String[] counts = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String color : colors) {
            for (String count : counts) {
                porkers.add(color + count);
            }
        }
        porkers.add("大王");
        porkers.add("小王");

        // 打乱牌
        Collections.shuffle(porkers);

        // 加入玩家和底牌库
        ArrayList<String> xPoker = new ArrayList<String>();
        ArrayList<String> jPoker = new ArrayList<String>();
        ArrayList<String> hPoker = new ArrayList<String>();
        ArrayList<String> dbPoker = new ArrayList<String>();

        for (int i = 0; i < porkers.size(); i++) {
            String currentPoke = porkers.get(i);
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
        lookPoker("x", xPoker);
        lookPoker("j", jPoker);
        lookPoker("h", hPoker);
        lookPoker("底牌", dbPoker);
    }

    static void lookPoker(String name, ArrayList<String > arr) {
        System.out.println(name + "的牌");
        for (String item :
                arr) {
            System.out.println(item);
        }
        System.out.println("----------");
    }
}
