package day10_Siwtch_Scanner;
import java.util.Scanner;
public class ratecalculator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your slary: ");
        int salary = scan.nextInt();

        System.out.println("How many hours do you work per week");
        byte weeklyHours = scan.nextByte();

        System.out.println("How many weeks do you work in a year");
        byte numberofWeeks =scan.nextByte();
        //hourlyRate= (salary / numberoftheWeeks) /weeklyHours

        int hourlyRate = (salary / numberofWeeks)/ weeklyHours;
        System.out.println("Your Hourly rate is:" +hourlyRate);

    }
}
