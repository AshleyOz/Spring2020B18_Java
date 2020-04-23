package day20_ArraysContinue;

import java.util.Scanner;

public class Months {
    public static void main (String[] args){
        String [] months={"Jan", "Feb", "Mar", "Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
        //                  0       1     2       3    4
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        while (num> 12|| num<=0){
            System.out.println("Invalid entry");
            System.out.println("please re-enter the number");
            num =input.nextInt();
        }
        String result= months[num-1];
        System.out.println(result);
    }
}
