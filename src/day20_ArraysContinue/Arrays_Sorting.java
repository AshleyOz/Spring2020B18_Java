package day20_ArraysContinue;
import java.util.Arrays;
public class Arrays_Sorting {
    public static void main(String[] args) {
        int[] arr1={9,8,7,6,5,4,3,2,1};
        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));

        System.out.println("First min num is: "+ arr1[0]);
        System.out.println("Second minimum is:"+arr1[1]);

        System.out.println("First max number is: "+arr1[arr1.length-1]);
        System.out.println("Second max number is: "+arr1[arr1.length-2]);

        char[] ch= {'Z','D','W','Y','A','B','E','D'};
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));

        System.out.println("========================");

        int[]arr={-1,3,5,6,8,9,0,100,70,150};
        Arrays.sort(arr);
       int[] arrDesc= new int[arr.length];
        System.out.println(Arrays.toString(arr));
        int j=0;
        for (int i = arr.length-1;i>=0;i-- ){
           // System.out.println(arr[i]+" ");
            arrDesc[j] =arr[i];

            j++;

            System.out.println(Arrays.toString(arr));
        }
    }
}
