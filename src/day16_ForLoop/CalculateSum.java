package day16_ForLoop;

import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt(); //100
        int sum=0;// 1+2+3+4...100

        for (int i= 1; i<= num; i++){
            System.out.println(i+ " ");
            sum += i;
        }
    }
}