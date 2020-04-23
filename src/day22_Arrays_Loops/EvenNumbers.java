package day22_Arrays_Loops;

import java.util.Arrays;

public class EvenNumbers {
    public static void main(String[] args) {
        int[] numbers= new int[100]; //index: 0~99,
        /*
        numbers[0]=1;
        numbers[1]=2;
        //....
        numbers[99]=100;
         */
        for (int i = 0; i <numbers.length; i++){
            numbers[i]= i+1;//assigning 1~100
        }

        System.out.println(Arrays.toString(numbers));

        for ( int each: numbers ){
            if (each % 2!=0){
                continue;
            }
            System.out.print(each+" ");
        }
    }
}
