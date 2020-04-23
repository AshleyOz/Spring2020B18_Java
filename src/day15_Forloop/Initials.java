package day15_Forloop;
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstname= scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        String initials = firstname.substring(0,1) + lastName.substring(0,1);//returns String
        initials = initials.toUpperCase();

        System.out.println(initials);
    }
}
