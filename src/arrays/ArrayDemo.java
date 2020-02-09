package arrays;

public class ArrayDemo {
    void oneDArray(){
        int array[]={1,2,3,4,5};
        int array1[]=new int[5];
        array1[0]=1;
        array1[1]=2;
        array1[2]=3;
        array1[3]=4;
        array1[4]=5;
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }

    void twoDArray(){
        int array[][]={{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<array.length;i++){
            for (int j=array.length-1;j>=0;j--){

                System.out.print(" "+array[i][j]);

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayDemo demo=new ArrayDemo();
        demo.twoDArray();
    }
}
