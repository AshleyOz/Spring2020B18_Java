package day10_Siwtch_Scanner;
import java.util.Scanner;
public class Scanner_Practice {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter your first number: ");
        byte num1= input.nextByte();
        System.out.println("Enter your second number: ");
        byte num2= input.nextByte();

                int total= (num1+num2);
        System.out.println("The sum of those numbers are: "+(num1+num2));
        //                ("The sum of "+num1+"and"+num2+"is:"total);

        System.out.println("Enter your first number: ");
        Short num3= input.nextShort();
        System.out.println("Enter your second number: ");
        Short num4= input.nextShort();
        System.out.println("The sum of those numbers are: "+(num3+num4));

    }
}
