package day16_ForLoop;

import java.util.Scanner;

public class RemoveDublicates {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String str = "CCDD";
        //           0123
        String result = "";//abab
        for (int i = 0; i <= str.length()-1; i++) {//0,1,2,3
           /* if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i);
            }
            System.out.println(result);

            */
           if (result.contains(""+str.charAt(i))){// i is index number -charArt = index number
               //if the sitring result does not contain str.charArt(i),then we concate it to the result,if it does we will not
               continue;
           }
           result+= str.charAt(i);


            }
        System.out.println(result);

        }
    }
