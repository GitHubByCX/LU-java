package revise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A4_ListCollection {
    public static void main(String[] args) {
        //arrayList 查询快，增删慢
        List<String> list = new ArrayList<String>();
        list.add("q");
        list.add("z");
        list.add("s");
        list.add("v");
        list.add("2");
        list.add(null);
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }

        //linkedList 查询慢，增删快

        //vector 线程同步，查询快，增删慢
    }
}
