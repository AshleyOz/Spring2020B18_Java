package day05_Unary_ShorthardOperators;

public class LeapYear {
    public static void main(String[] args) {

        short year= 2020;
        // leap year is divisible by 4
        // leapYear: year %4
        boolean leapYear=  year % 4 == 0; // if the year can be devided by 4 without any reminder then it is leap year

        //System.out.println( year + "is leap year :" + leap year);

        String result = year + "is leap year:" + leapYear;
        System.out.println(result);



    }
}
