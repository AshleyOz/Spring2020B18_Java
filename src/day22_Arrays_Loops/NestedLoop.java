package day22_Arrays_Loops;

public class NestedLoop {
    public static void main(String[] args) {
        //                 0   1     0   1   2     0   1   2   3
        char [][] arr2D={{'A','B'},{'C','D','E'},{'F','J','H','I'}};
        //                   0          1                2
        // each INDEX in arrD2 MUST be single dimensional array
        //arr2D [0] ==> {'C','D','E'}
        for (int i=0;i< arr2D[1].length;i++){
            System.out.println(arr2D[1][i]);
        }
        //arr2D[1] ==>{'F','J','H','I'}
        for (int i=0; i<arr2D[2].length;i++){
            System.out.println(arr2D[2][i] );
        }
        System.out.println("===================================");


    }
}
