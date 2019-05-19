package revise;

import java.util.Random;

public class A3_SortMethods_TestSort {
    public static void main(String[] args) {
        int[] arr = getRandomArray(10000);
        showArray(arr,"原数组");
        //
        A3_SortMethods sortMethods = (A3_SortMethods)new A3_SortMethods_DynamicProxyObject().bind(new A3_SortMethods_Impl(),new A3_SortMethods_ImplLogger());
        //
        int[] arr1 = sortMethods.bubbleSort(arr);
        showArray(arr1,"bubble sort");
        //
        int[] arr2 = sortMethods.selectionSort(arr);
        showArray(arr2,"selection sort");
        //
        int[] arr3 = sortMethods.quickSort(arr,0,arr.length-1);
        showArray(arr3,"quick sort");

        /*A3_SortMethods_Impl m = new A3_SortMethods_Impl();
        int[] arr4 =  m.quickSort(arr,0,arr.length-1);
        showArray(arr4,"quick sort");*/
    }

    //
    public static int[] getRandomArray(int num){
        Random random = new Random();
        int[] arr = new int[num];
        for(int i = 0;i<arr.length;i++){
            arr[i] = random.nextInt(100);
        }
        return arr;
    }

    //
    public static void showArray(int[] arr,String str){
        System.out.print(str+" : ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+".");
        }
        System.out.println("\n");
    }
}
