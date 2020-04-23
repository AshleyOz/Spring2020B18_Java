package day12_JavaRecap;

import java.util.Scanner;

public class Ternaries_Practice {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter the status code: ");
        int statusCode = scan.nextInt();

        String result = "";
        if (statusCode==201){
            result="Ok";

        }else if(statusCode==201){
            result= "Created";
        }else if (statusCode==202){
            result="Accepted";
        }else{
            result="invalid";
        }
        System.out.println(result);
    }
}
