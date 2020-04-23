package day17_WhileLoops;


import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int MaxNumber = -1999999999; //any number the user provided will be greater than this number
        //first user entered variable will be initialized to MaxNumber
        //MaxNumber=5;
        int MinNumber = 2147483647;
        //MinNumber= 0;
        for (int i = 1; i <= 10; i++) {//i:1,2,3,4,5
            System.out.println("Enter a number");
            int num = input.nextInt(); // user entered : 0, 1 ,2 ,3 ,4

            if (num > MaxNumber) { // to compare ecah user inputs, and assign the maximum number to MaxNumber
                MaxNumber = num;
            }
            if (num < MinNumber) { //TO COMPARE EACH USER INPUTS, AND ASSIGN THE MIN NUMBER to MaxNumber
                MinNumber = num;

            }
            System.out.println("Maximum Number: "+MaxNumber);
            System.out.println("Minimum Number: "+MinNumber);
        }
    }

}