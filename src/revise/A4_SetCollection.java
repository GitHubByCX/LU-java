package revise;

import java.util.HashSet;
import java.util.Set;

public class A4_SetCollection {
    public static void main(String[] args) {
        //hashSet 无序 唯一
        Set<String> set = new HashSet<String>();
        set.add("1");
        set.add("0");
        set.add("i");
        set.add("f");
        set.add("s");
        set.add(null);
        System.out.println(set);

        //treeSet 有序 唯一

        //linkedHashSet 先进先出顺序 唯一

    }
}
