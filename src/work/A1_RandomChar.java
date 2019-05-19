package work;

import java.util.Random;

public class A1_RandomChar {
    public static void main(String[] args) {
        Random random = new Random();
        String str= "睡眠和休息丧失了时间，却取得了明天工作的精力。 —— 毛泽东";
        char[] c = str.toCharArray();
        System.out.println(str);
        System.out.println("随机输出的字符为 : "+c[random.nextInt(str.length())]);
    }
}
