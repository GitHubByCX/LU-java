package revise;

public class A1_bubbleSort {
    public static void main(String[] args) {
        int[] body ={1,10,20,5,23,17,95,44,13};

        int i = 0;

        for (;i<body.length;i++){

            System.out.print("k : "+i+"----");
            for(int k = 0;k<body.length;k++){
                System.out.print(body[k]+" - ");
            }
            System.out.println();


            for (int j = 0;j<body.length;j++){
                if(body[i]<body[j]){
                    int temp = body[i];
                    body[i] = body[j];
                    body[j] = temp;

                    //System.out.print(" , "+body[i]+"<--"+body[j]+" , ");
                }else{
                    //System.out.print(" , "+body[i]+"<--"+body[j]+" , ");
                }
            }
            System.out.println();
        }

        for(int k = 0;k<body.length;k++){
            System.out.print(body[k]+" - ");
        }
    }
}
