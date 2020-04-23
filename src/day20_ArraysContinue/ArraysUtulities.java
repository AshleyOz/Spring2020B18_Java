package day20_ArraysContinue;

import java.util.Arrays;

public class ArraysUtulities {
    public static void main(String[] args) {
        int[] arr ={1,2,3};

        String r= Arrays.toString(arr);
        System.out.println(r);

        System.out.println(arr);//array must be converted to string before we print

        String names[]= {"Madina","Fatih","Osman"};

        System.out.println(Arrays.toString(names));
    }
}
