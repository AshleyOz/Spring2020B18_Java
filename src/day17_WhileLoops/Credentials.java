package day17_WhileLoops;

import java.util.Scanner;

public class Credentials {
    /*user: Cybertek
    password:cybertek123
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter User Name");
        String username= input.next();

        System.out.println("Enter Password");
        String password= input.next();
        boolean valid = (username.equals("cybertek") && password.equals("cybertek123") ); // false
        // validating the first username and password
        int count = 1;

        while (!valid){
            System.out.println("Please re enter your credentials");
            System.out.println("Enter User name");
            username = input.next();

            System.out.println("Enter password");
            password =input.next();
            valid=  (!(username.equals("cybertek")&& password.equals("Cybertek123") )); //true

        }
        System.out.println("Logged in");
    }
}
