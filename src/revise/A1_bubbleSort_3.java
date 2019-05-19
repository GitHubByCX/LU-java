package revise;

import java.util.Random;

public class A1_bubbleSort_3 {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        arr = getRandomNum(arr);
        arr = bubbleSort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }

    public static int[] bubbleSort(int[] arr){
        for (int i = 1;i<arr.length;i++){
            for(int j = 0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    //获取0-100之间的随机数
    public static int[] getRandomNum(int[] arr){
        Random random = new Random();
        for(int i = 0;i<arr.length;i++){
            arr[i] = random.nextInt(100);
        }
        return  arr;
    }

}
