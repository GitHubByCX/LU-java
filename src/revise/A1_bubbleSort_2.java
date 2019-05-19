package revise;

import java.util.Random;

public class A1_bubbleSort_2 {

    private static long[] time = new long[100];

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[1000];

        System.out.print("原数组 : ");
        for (int i = 0;i<arr.length;i++){
            arr[i] = random.nextInt(100);
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+".");
        }
        System.out.println();

        System.out.print("排序后数组 : ");
        int[] sort_arr = bubbleSort1(arr);
        for(int i = 0;i<sort_arr.length;i++){
            System.out.print(sort_arr[i]+".");
        }
        System.out.println();
        System.out.println("用时:"+time[0]);

        System.out.print("排序后数组 : ");
        int[] sort_arr2 = bubbleSort2(arr);
        for(int i = 0;i<sort_arr2.length;i++){
            System.out.print(sort_arr2[i]+".");
        }
        System.out.println();
        System.out.println("用时:"+time[1]);

    }

    public static int[] bubbleSort1(int[] arr){
        long t1 = System.currentTimeMillis();
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        long t2 = System.currentTimeMillis();
        time[0] = t2-t1;
        /*System.out.print("时间1："+t1);
        System.out.print("时间2："+t2);
        System.out.println();*/
        return arr;
    }

    public static int[] bubbleSort2(int[] arr){
        long t1 = System.currentTimeMillis();
        for(int i = 1;i<arr.length;i++){
            for(int j = 0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        long t2 = System.currentTimeMillis();
        time[1] = t2-t1;
        /*System.out.print("时间1："+t1);
        System.out.print("时间2："+t2);
        System.out.println();*/
        return arr;
    }

}
