package day21_MultiDimentinalArrays;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name= "Java";//J,a,v,a

        String str="i like Java";
        String []arr=str.split(" ");
        System.out.println(Arrays.toString(arr));
        /*
        reverse sentence: day great id today fghh
         */
        String sentence="Today is great day";
        String [] words= sentence.split(" ");

        System.out.println(Arrays.toString(words));//(Today is a great day)
        String result="";

        for (int i = words.length-1; i>=0;i--){
            String eachwords= words[i];
           // System.out.println(eachwords+" ");
            result += eachwords+=" ";
        }
        System.out.println(result);

        String str2= "ABCD";
        String arr2[]= str2.split(""); //["A", "B","C","D"]
        char[] ch2=str2.toCharArray();//['A','B','C','D']

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(ch2));
    }
}
