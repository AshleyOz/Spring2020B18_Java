package day12_JavaRecap;

import java.util.Scanner;

public class Terinary_Practice {
    public static void main(String[] args) {

        char ch1='A';
        String result=(ch1=='A')? "A is selected":(ch1=='B')? "B is selected"
                :(ch1=='C')?"C is selected" :(ch1== 'D') ?"D is selected":
                (ch1== 'E')?"E is selected": "Invalid Charecter";
        System.out.println(result);

    }
}
