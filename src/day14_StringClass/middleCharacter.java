package day14_StringClass;

import java.util.Scanner;
/*
3. Write a Java method to display the middle character of a string
		a) If the length of the string is even there will be two middle characters.
		b) If the length of the string is odd there will be one middle character.
				Input :
					elephant
				Output:
					The middle character in the string: ph
 */
public class middleCharacter {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your word");
        String word = input.next(); //Cyber
        //                            01234
        String middleCharacter= ""; //to store the middle character at the end

        int totalChars = word.length();//7
        int middleNumber= totalChars/2; // 7/2=3

        if(totalChars%2 !=0){//odd numbers
           // middleCharacter+=word.charAt(middleNumber);
            middleCharacter= middleCharacter + word.charAt(middleNumber);
        }
        System.out.println(middleCharacter);

    }
}
