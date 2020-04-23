package day11_Scanner;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the full name: ");
        String fullname= input.nextLine();//accepts the "Enter"
        System.out.println("Your full name is: "+fullname);
    }
}
