package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Building Number: ");
        int Bnumber = input.nextInt();//7925

        System.out.println("Bulding number is : "+Bnumber);

        input.nextLine();//used for taking out the Enter from scanner
        System.out.println("Street: ");
        String street= input.nextLine();

        System.out.println("Street is : "+street);

        System.out.println("Enter the zip code: ");
        int zipcode= input.nextInt();//22034

        input.nextLine(); //take out the enter

        System.out.println("enter the city name and state sperated by coma and space");
        String cityState= input.nextLine();
        String fulladdress= Bnumber+" "+street+",\n "+cityState+" "+zipcode;
        System.out.println(fulladdress);

    }
}
