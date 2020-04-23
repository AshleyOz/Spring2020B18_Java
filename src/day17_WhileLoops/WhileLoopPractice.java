package day17_WhileLoops;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter Yes or No");
        String word= input.next();

        boolean valid=  word.equalsIgnoreCase("yes")|| word.equalsIgnoreCase("no");

            while (!valid){ // while the input is not yes or no, repeats the question

            System.out.println("please re-enter");
            word= input.next();
        }
            if (word.equalsIgnoreCase("Yes")|| word.equalsIgnoreCase("no")) {
            }

            if (word.equalsIgnoreCase("Yes")){
                System.out.println("Entered Yes");
            }
            if (word.equalsIgnoreCase("No")){
                System.out.println("Entered No");
            }
    }
}
