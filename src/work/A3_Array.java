package work;

import java.util.ArrayList;
import java.util.List;

public class A3_Array {
    public static void main(String[] args) {
        String [] str = {"A", "D", "C", "F"};
        for (String elementA:str ) {
            System.out.print(elementA + " ");
        }
        System.out.println();

        String[] newStr1 =  testB(str);
        for (String elementB:newStr1 ) {
            System.out.print(elementB + " ");
        }

        System.out.println();

        String[] newStr2 =  testC(str);
        for (String elementB:newStr2 ) {
            System.out.print(elementB + " ");
        }
        System.out.println();

        for(int i = str.length-1;i>0;i--){
            System.out.print(str[i] + " ");
        }
    }


    //删除数组中其中一个元素
    public static String[] testB(String[] str) {
        List<String> list = new ArrayList<String>();
        for (int i=0; i<str.length; i++) {
            list.add(str[i]);
        }
        list.remove(2);
        String[] newStr =  list.toArray(new String[1]);
        return newStr;
    }

    //在数组中增加一个元素
    public static String[] testC(String[] str) {
        List<String> list = new ArrayList<String>();
        for (int i=0; i<str.length; i++) {
            list.add(str[i]);
        }
        list.add(1, "B");
        String[] newStr =  list.toArray(new String[1]);
        return newStr;
    }
}
