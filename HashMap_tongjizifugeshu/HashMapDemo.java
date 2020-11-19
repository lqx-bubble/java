package HashMap_tongjizifugeshu;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.Set;

/*
    需求：
        键盘录入字符串，要求统计字符出现次数
    思路：
        1.键盘录入
        2.创建HashMap集合，键是Character，值是Integer
        3.遍历字符串，得到每一个字符
        4.拿得到的每一个字符作为键到HashMap集合中找对应的值，看其返回值
            返回为null,说明字符第一次出现，把其作为键，1为值存储
            返回不是bull，把值+1，重新存储该字符和对应的值
        5.遍历HashMap集合，得到键和值
        6.输出

 */
public class HashMapDemo {
    public static void main(String[] args) {
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String line = sc.nextLine();

        //2.创建HashMap集合，键是Character，值是Integer
        //HashMap<Character,Integer> hm = new HashMap<Character,Integer>();// 键无序
        TreeMap<Character,Integer> hm = new TreeMap<Character,Integer>();// 键有序

        //3.遍历字符串，得到每一个字符
        for (int i = 0;i<line.length();i++){
            char key = line.charAt(i);

            //4.拿得到的每一个字符作为键到HashMap集合中找对应的值，看其返回值
            Integer value = hm.get(key);  //
            if (value == null){     //返回为null,说明字符第一次出现，把其作为键，1为值存储
                hm.put(key,1);
            }else {     //返回不是bull，把值+1，重新存储该字符和对应的值
                value++;
                hm.put(key,value);
            }
        }
        //5.遍历HashMap集合，得到键和值，拼接
        StringBuilder sb = new StringBuilder();

        Set<Character> keySet = hm.keySet();
        for (Character key :keySet){
            Integer value = hm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }
        System.out.println(sb);
    }
}
