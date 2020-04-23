package day14_StringClass;
import java.util.Scanner;

/*
        valid credentials are:
            username: cybertek
            password: cybertekschool
        if user entered both valid username and password  ==> log in
        if valid password, invalid username ==> username is incorrect
        if valid user name, invalid password ==> password is incorrect
        if both password and username are invalied ==> invalid username and password
     */
public class Credentials2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter your username");
        String inputUsername= input.next();

        System.out.println("Enter your password");
        String inputPassword= input.next();

        boolean logedIn= inputUsername.equals("Cybertek")&& inputPassword.equals("ceybertekschool");
        //user entered both valid username and password
        boolean InvalidUserName= ! inputUsername.equals("Cybertek")&& inputPassword.equals("cybertekschool");
        boolean InvalidPassword= inputUsername.equals("Cybertek")&& !inputPassword.equals("cybertekschool");
        //username is valid, but password is invalid

        if(!inputUsername.isEmpty() && !inputPassword.isEmpty()) {//username and password are not empty
            if (logedIn) {
                System.out.println("Logged in");

            } else if (InvalidUserName) {
                System.out.println("Password is correct, username is incorrect");

            } else if (InvalidPassword) {
                System.out.println("Username is correcet, password is invalid");
            } else {
                System.out.println("Both password and username is incorrect");

            }
        }else{//username and password is empty
                System.out.println("Please enter the credentials");

            }


        }

    }

