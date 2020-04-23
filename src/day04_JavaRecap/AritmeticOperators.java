package day04_JavaRecap;

public class AritmeticOperators {

    public static void main(String[] args) {
        //10 / 3 ==> 3.333
        int a = 10 / 3 ; //3
        System.out.println(a);

        //10/4==>2.5   int can not have any decimal . it only sees whole number
        System.out.println(10 / 4); //2

        double d = 10 /4 ;
        // double d=2;
        // d==>2.0
        System.out.println(d);//2.0

        System.out.println(10.0 / 4);// 2.5
        System.out.println(10 / 4.0);//2.5
        System.out.println(10.0 / 4.0);//2.5


        boolean evenNumber= 25 % 2  == 0;
        //if 25 /2 has a remainder of zero then it is even number
        System.out.println(evenNumber); ///false
        System.out.println(25 % 2 );

        boolean oddNumber = 22 % 2 ==0;
        // 0 ! 0 ==> false

        System.out.println(oddNumber);
        System.out.println( 10 % 2 == 0 ); // 10 is even number
        System.out.println( 11 %  2!=0); // 11 is odd number



    }
}
