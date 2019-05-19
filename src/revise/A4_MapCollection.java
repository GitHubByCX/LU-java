package revise;

import java.util.HashMap;
import java.util.Map;

public class A4_MapCollection {
    public static void main(String[] args) {
        //hashMap   无序 效率高 允许空值(key允许一个为null，value不限)
        System.out.println("HASH MAP:");
        Map<String,Integer> map = new HashMap<>();
        map.put("k3",3);
        map.put("k2",2);
        map.put("k1",1);
        map.put("k4",4);
        map.put(null,5);
        map.put("k6",null);
        map.put("k7",null);
        for(String i : map.keySet()){
            System.out.print("{key:"+i+" ,value:"+map.get(i)+"}--");
        }
        System.out.println();
        for(Map.Entry<String,Integer> m : map.entrySet()){
            System.out.print("{key:"+m.getKey()+" ,value:"+m.getValue()+"}--");
        }

        //treeMap 有序排序

        //hashTable 无序 不允许为null 效率低 线程同步
    }
}
