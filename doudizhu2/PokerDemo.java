package doudizhu2;

import java.util.*;

/*
    需求：通过程序实现斗地主过程中的洗牌，发牌，看牌。要求：对牌进行排序
    思路：
        1.创建HashMap，键是编号，值是牌
        2.创建ArrayList，存储编号
        3.创建花色数组和点数数组
        4.从0开始往HashMap里面存储编号，并存储对应的牌。同时往ArrayList里面存储编号
        5.洗牌（洗的是编号），用Collection的shuffle()方法实现
        6.发牌（发的是编号，为了保证编号是排序的，创建TreeSet集合接收）
        7.定义方法看牌（遍历TreeSet集合，获取编号，到HashMap集合去找对应的牌）
        8.调用方法看牌
 */
public class PokerDemo {
    public static void main(String[] args) {
        //1.创建HashMap，键是编号，值是牌
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        //2.创建ArrayList，存储编号
        ArrayList<Integer> array = new ArrayList<Integer>();

        //3.创建花色数组和点数数组
        String[] colors = {"♠", "♥", "♦", "♣"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        //4.从0开始往HashMap里面存储编号，并存储对应的牌。同时往ArrayList里面存储编号
        int index = 0;

        for (String num : numbers) {
            for (String color : colors) {
                hm.put(index, color + num); //往HashMap里面存储编号，并存储对应的牌
                array.add(index);//同时往ArrayList里面存储编号
                index++;
            }
        }
        //存大小王
        hm.put(index, "大王");
        array.add(index);
        index++;
        hm.put(index, "小王");
        array.add(index);

        //5.洗牌（洗的是编号），用Collection的shuffle()方法实现
        Collections.shuffle(array);

        //6.发牌（发的是编号，为了保证编号是排序的，创建TreeSet集合接收）
        TreeSet<Integer> Bool = new TreeSet<Integer>();
        TreeSet<Integer> Alex = new TreeSet<Integer>();
        TreeSet<Integer> Colo = new TreeSet<Integer>();
        TreeSet<Integer> dp = new TreeSet<Integer>();

        for (int i = 0; i < array.size(); i++) {
            int x = array.get(i);
            if (i >= array.size() - 3) {    //剩三张牌的时候作为底牌
                dp.add(x);
            } else if (i % 3 == 0) {
                Bool.add(x);
            } else if (i % 3 == 1) {
                Alex.add(x);
            } else {
                Colo.add(x);
            }
        }

        //8.调用方法看牌
        lookPoKer("Bool", Bool, hm);
        lookPoKer("Alex", Alex, hm);
        lookPoKer("Colo", Colo, hm);
        lookPoKer("底牌", dp, hm);

    }

    //7.定义方法看牌（遍历TreeSet集合，获取编号，到HashMap集合去找对应的牌
    public static void lookPoKer(String name, TreeSet<Integer> ts, HashMap<Integer, String> hm) {
        System.out.print(name + "的牌是：");
        for (Integer key : ts) {  //遍历TreeSet
            String poker = hm.get(key);//根据编号找对应的牌
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
