package day03_VariablesContinue;

public class VariablesContinue {

    public static void main(String[] args) {

        //comparision operators:
        //		>: greater
        //		>=: greater or equal
        //		<: less
        //		<=: less or equal
        //		== : equal
        //		!= : not equal

        boolean result1 = true;
        boolean result2 = false;

        boolean result3 = 10 > 9 ; //true
        System.out.println(result3);

        System.out.println( true == false );

        char ch1 = 'A';
        System.out.println(ch1); //A

        char ch2 = 45000;
        System.out.println(ch2);

        int num1 = 'D'; //number
        System.out.println(num1);
        char a1 = 'z';
        //byte b1 = a1; not possible  //char is larger than byte
        byte b1 = 'z';

        //short s1 = a1 ; // not possible char is larger than short
        int i1 = a1; // int is lager than char


    }
}
