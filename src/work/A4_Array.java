package work;

public class A4_Array {
    public static void main(String[] args) {
        //创建,创建两个数组,将相应的值添加进去
        int[] a = { 3,9,6,99,64,3,5,9};
        int[] b = { 6,11,55,7,8,6,5,6 };

        //输出,使用for和foreach两种方式输出其中一个数组
        System.out.println("for：");
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
        System.out.println("\nforeach：");
        for (int i : b){
            System.out.print(i+",");
        }

        //排序,使用冒泡,选择,快速或者其他排序方式进行排序并输出一个数组
        System.out.println("\n冒泡排序前");
        for (int i : a){
            System.out.print(i+",");
        }
        for(int i = 1;i<a.length;i++){
            for (int j = 0;j<a.length-i;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("\n冒泡排序后");
        for (int i : a){
            System.out.print(i+",");
        }

    }
}
