package day22_Arrays_Loops;

public class NestedLoop2 {
    public static void main(String[] args) {
        int[][] numbers={{9,8,7},{6},{5,4,3,2,1,0}};
        //                 0     1        2
        /*     k
        number[0]==> {9,8,7} number [0][i] is needs to be repeated three times
        number[1]==>{6} number [1][i] is needs to be repeated one times
        number[2]==> {5,4,3,2,1,0} number [2][i] is needs to be repeated 6 times
         */
        for (int k=0; k<numbers.length;k++){
            for (int i=0;i < numbers[k].length;i++){
                System.out.print(numbers[k][i]+" ");
            }
            System.out.println();
        }
    }
}
