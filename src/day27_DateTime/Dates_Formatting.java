package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Dates_Formatting {
    public static void main(String[] args) {
        DateTimeFormatter  dtf= DateTimeFormatter.ofPattern("yy/MM/dd");


       LocalDate date1=LocalDate.now();
        System.out.println(date1.format(dtf));

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("EEE MMM/dd/yy");

        LocalDate date2= LocalDate.of(1999,11,25);
        String str1= date2.format(dtf2);
        System.out.println(str1);

        LocalDate date3= LocalDate.now();

        System.out.println(date3.format(dtf2));






    }
}
