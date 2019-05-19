package revise;

public class A3_SortMethods_Impl implements A3_SortMethods{
    @Override
    public int[] selectionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {// 做第i趟排序
            int k = i;
            for (int j = k + 1; j < arr.length; j++) {// 选最小的记录
                if (arr[j] < arr[k]) {
                    k = j; //记下目前找到的最小值所在的位置
                }
            }
            //在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
            if (i != k) {  //交换a[i]和a[k]
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }
        return arr;
    }

    @Override
    public int[] bubbleSort(int[] arr) {
        for(int i = 1;i<arr.length;i++){
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

    @Override
    public int[] quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int middle = getMiddle(arr, low, high);  //将list数组进行一分为二
            quickSort(arr, low, middle - 1);        //对低字表进行递归排序
            quickSort(arr, middle + 1, high);       //对高字表进行递归排序
        }
        return arr;
    }

    public int getMiddle(int[] arr, int low, int high){
        int tmp = arr[low];    //数组的第一个作为中轴
        while (low < high) {
            //while (low < high && list[high] > tmp) {
            while (low < high && arr[high] >= tmp) {
                high--;
            }
            arr[low] = arr[high];   //比中轴小的记录移到低端
            // while (low < high && list[low] < tmp) {
            while (low < high && arr[high] >= tmp) {
                low++;
            }
            arr[high] = arr[low];   //比中轴大的记录移到高端
        }
        arr[low] = tmp;              //中轴记录到尾
        return low;                   //返回中轴的位置
    }
}
