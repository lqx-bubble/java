package ArrayList_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
    需求：创建一个ArrayList集合，存储三个元素，每一盒都是HashMap。每一个HashMpa的键和值都是String，并遍历
    思路：
        1.创建ArrayList集合
        2.创建HashMap集合，并添加键值对元素
        3.把HashMap作为元素添加到ArrayList集合
        4.遍历ArrayList集合

    给出如下数据：
        第一个HashMap集合：
            周瑜  小乔
            孙策  大乔
        第二个HashMap集合：
            郭靖  黄蓉
            杨过  小龙女
        第三个HashMap集合：
            令狐冲 任盈盈
            林平之 岳灵珊
 */
public class ArrayList_Map_Demo {
    public static void main(String[] args) {
        //1.创建ArrayList集合
        ArrayList<HashMap<String,String>> array = new ArrayList<HashMap<String,String>>();

        //2.创建HashMap集合，并添加键值对元素
        HashMap<String,String> hm1 = new HashMap<String,String>();
        hm1.put("周瑜","小乔");
        hm1.put("孙策","大乔");

        HashMap<String,String> hm2 = new HashMap<String,String>();
        hm1.put("郭靖","黄蓉");
        hm1.put("杨过","小龙女");

        HashMap<String,String> hm3 = new HashMap<String,String>();
        hm1.put("令狐冲","任盈盈");
        hm1.put("林平之","岳灵珊");

        //3.把HashMap作为元素添加到ArrayList集合
        array.add(hm1);
        array.add(hm2);
        array.add(hm3);

        //4.遍历ArrayList集合
        for (HashMap<String,String> hm : array){
            Set<String> keySet = hm.keySet();
            for (String key : keySet){  //键找值方式遍历
                String value = hm.get(key);
                System.out.println(key+"-"+value);
            }
        }
    }
}
