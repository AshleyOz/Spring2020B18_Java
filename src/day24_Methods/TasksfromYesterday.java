package day24_Methods;

import java.util.Arrays;

public class TasksfromYesterday {
    public static void MaxNumber(int[] array) {
        Arrays.sort(array);//accending order
        System.out.println( array.length-1);
    }

    public static void MiniNumber(int[] array) {
        Arrays.sort(array);//ascending order
        System.out.println("Minimum number is: "+ array[0]);

    }

    public static void main(String[] args) {
        int[] arr= {10,8,9,5,4,3,2,1};
        //MaxNumber(10) ; //10, if paramater is array, the argument MUST be array
        MaxNumber(arr);
        MiniNumber(arr);

        int[] arr2={100,20,30,40,40,-100};
        MaxNumber(arr2);
        MiniNumber(arr2);
    }
}
