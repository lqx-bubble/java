package MyMap;

import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    Map集合的遍历（方式一）：
    1.获取所有键的集合。用keySet()方法实现
    2.遍历键的集合，获取到的每一个键。用增强for实现
    3.根据键去找值。用get(Object key)方法实现
 */

/*
    方式二：
    1.获取所有键值对对象的集合
        Set<Map.Entry<K,V>> entrySet():
    2.遍历键值对对象的集合，得到每一个Map.Entry（增强for）
    3.根据键值对对象获取键值
        用getKey()得到键
        用getValue()得到键

 */
public class MapDemo1 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String, String> map = new HashMap<String, String>();

        //V put (K key,V value)
        map.put("k1", "Alex");
        map.put("k2", "Bool");
        map.put("k3", "Blee");
        map.put("k4", "Colu");

        //遍历（方式一）
        //1.获取所有键的集合。用keySet()方法实现
//        Set<String> keySet = map.keySet();

//        //2.遍历键的集合，获取到的每一个键。用增强for实现
//        for (String key : keySet) {
//            //3.根据键去找值。用get(Object key)方法实现
//            String value = map.get(key);
//            System.out.println(key+"："+value);
//        }

        //遍历（方式二）
        //1.获取所有键值对对象的集合        Set<Map.Entry<K,V>> entrySet():
        Set<Map.Entry<String, String>> entries = map.entrySet();

        //2.遍历键值对对象的集合，得到每一个Map.Entry（增强for）
        for (Map.Entry<String, String> e : entries){
//            3.根据键值对对象获取键值
//            用getKey()得到键
//            用getValue()得到键
            String key = e.getKey();
            String value = e.getValue();
            System.out.println(key+"："+value);
        }
    }
}
