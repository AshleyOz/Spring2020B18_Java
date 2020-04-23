package day13_StringClass;

import java.util.Scanner;

/*
2. write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:
			and prints the ship to info in the following format:
			ex output:
					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102
 */
public class ShippingInfo {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);//Enter
        System.out.println("Enter your Building Number");
        String buldingNum= input.nextLine();//112A

        input.nextLine();//Enter

        System.out.println("Enter your Street Address");
        String streetAddress= input.nextLine();

        System.out.println("Enter your city name: ");
        String cityName= input.next();

        System.out.println("Enter your state");
        String stateName= input.nextLine();

        System.out.println("Enter your zip code");
        String zipCode= input.next();
        input.nextLine();

        System.out.println("Enter your Full Name");
        String fullName= input.nextLine();

        String result= "Ship to: "+fullName+"\n\t\t"+buldingNum+" "+streetAddress+"\n\t\t";





    }
}
