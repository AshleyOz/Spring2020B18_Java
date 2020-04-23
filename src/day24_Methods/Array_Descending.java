package day24_Methods;

import java.util.Arrays;

public class Array_Descending {
    public static void main(String[] args) {
        int[] arr1={1,10,9,8,14,15};
        int[] arr2={200,100,150,500,400};
        int[] arr3={1000,800,5000,3000};

        arr1= sortDesending(arr1);
        arr2 =sortDesending(arr2);
        arr3 =sortDesending(arr3);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

    }

    public static int[] sortDesending(int[]arr) {
        Arrays.sort(arr);
        int[]RevArr=new int[arr.length];
        /*
               i      i
        RevArr[0]=arr[3]
        RevArr[1]=arr[2]
        RevArr[2]=arr[1]
        RevArr[3]=arr[0]

         */


            int j=arr.length-1;
        for (int i=0; i<arr.length;i++){
            RevArr[i]=arr[j];
            j--;

        }

        return RevArr;

    }

    public static void Reverse(String str) {
        String Reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            Reverse += str.charAt(i);

        }
        //return Reverse;

    }


    }

